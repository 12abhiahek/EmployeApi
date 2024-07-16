package com.nt.employe.Employe.Repository;

import com.nt.employe.Employe.DTO.EmployeDto;
import com.nt.employe.Employe.Entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepos extends JpaRepository<Employe,Long> {
    Employe getNewEmp(EmployeDto data);
}
