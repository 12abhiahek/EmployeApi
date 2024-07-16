package com.nt.employe.Employe.Service;

import com.nt.employe.Employe.DTO.EmployeDto;
import com.nt.employe.Employe.Entity.Employe;
import com.nt.employe.Employe.Repository.EmployeRepos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeRepos employeRepos;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public EmployeDto getEmpId(Long Id) {
        Employe employe= employeRepos.getById(Id);
        //return new EmployeDto(employe.getName(), employe.getId(),employe.getDateOfJoing(),employe.isActive());
        return  modelMapper.map(employe,EmployeDto.class);
    }

    @Override
    public EmployeDto createNewEmp(EmployeDto data) {
        Employe employe=employeRepos.getNewEmp(data);
        return modelMapper.map(employeRepos.save(employe),EmployeDto.class);
    }

    @Override
    public List<EmployeDto> getAllEmp() {
        return employeRepos.findAll()
                .stream().map(employe -> modelMapper.map(employe,EmployeDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteEmp(Long id) {
        boolean isPresent=employeRepos.existsById(id);
        if(!isPresent)
            return false;
         employeRepos.deleteById(id);
         return  true;

    }
}
