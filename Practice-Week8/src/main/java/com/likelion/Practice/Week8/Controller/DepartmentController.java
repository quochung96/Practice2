package com.likelion.Practice.Week8.Controller;

import com.likelion.Practice.Week8.Dto.DepartmentDto;
import com.likelion.Practice.Week8.Dto.EmployeeDto;
import com.likelion.Practice.Week8.Service.DepartmentService;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/department")
    public ResponseEntity<DepartmentDto> getDepartmentDto(@RequestBody DepartmentDto departmentDto){
        return ResponseEntity.ok(departmentService.getDepartmentDto(departmentDto));
    }
}
