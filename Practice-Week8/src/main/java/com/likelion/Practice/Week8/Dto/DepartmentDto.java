package com.likelion.Practice.Week8.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    @NotNull(message = "Department ID is null")
    private Long departmentId;
    @NotEmpty(message = "DeptName is null")
    @Size(min = 10,max = 50)
    private String deptName;
    @NotEmpty(message = "Description is null")
    private String description;
    @Valid
    List<EmployeeDto> employeeDtoList;
}
