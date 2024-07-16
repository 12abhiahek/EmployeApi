package com.nt.employe.Employe.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeDto {

    private  String name;
    private  Long Id;
    private LocalDate DateOfJoining;
    private boolean isActive;

}
