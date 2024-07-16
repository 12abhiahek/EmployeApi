package com.nt.employe.Employe.Controller;


import com.nt.employe.Employe.DTO.EmployeDto;
import com.nt.employe.Employe.Service.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class EmployeControl {

    @Autowired
    EmployeServiceImpl employeService;

    @GetMapping("/{id}")
    public EmployeDto getEmpId(@PathVariable("id") Long id){
        return employeService.getEmpId(id);
    }
    @PostMapping
    public EmployeDto createNewEmp(@RequestBody  EmployeDto data){
     return  employeService.createNewEmp(data);
    }
    @GetMapping("/allemp")
    List<EmployeDto> getAllEmp(){
      return employeService.getAllEmp();
    }
    @DeleteMapping("/{id}")
    public boolean deleteEmp(@PathVariable Long id){
        return employeService.deleteEmp(id);

    }

}
