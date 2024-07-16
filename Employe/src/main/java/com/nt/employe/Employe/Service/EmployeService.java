package com.nt.employe.Employe.Service;

import com.nt.employe.Employe.DTO.EmployeDto;

import java.util.List;

public interface EmployeService {

    public EmployeDto getEmpId(Long Id);
    public EmployeDto createNewEmp(EmployeDto data);
    List<EmployeDto> getAllEmp();
    public boolean deleteEmp(Long id);

}
