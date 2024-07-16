package com.nt.employe.Employe.Service;

import com.nt.employe.Employe.DTO.EmployeDto;
import com.nt.employe.Employe.Repository.EmployeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeRepos employeRepos;

    @Override
    public EmployeDto getName(String name) {
        return null;
    }
}
