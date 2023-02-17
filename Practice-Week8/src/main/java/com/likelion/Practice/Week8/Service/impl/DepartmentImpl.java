package com.likelion.Practice.Week8.Service.impl;

import com.likelion.Practice.Week8.Dto.DepartmentDto;
import com.likelion.Practice.Week8.Service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentImpl implements DepartmentService {
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        return departmentDto;
    }
}
