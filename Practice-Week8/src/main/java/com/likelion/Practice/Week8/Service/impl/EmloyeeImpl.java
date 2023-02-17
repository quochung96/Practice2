package com.likelion.Practice.Week8.Service.impl;

import com.likelion.Practice.Week8.Dto.EmployeeDto;
import com.likelion.Practice.Week8.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmloyeeImpl implements EmployeeService {

    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {
        return employeeDto;
    }
}
