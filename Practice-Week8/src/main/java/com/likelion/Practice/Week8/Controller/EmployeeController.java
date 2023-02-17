package com.likelion.Practice.Week8.Controller;

import com.likelion.Practice.Week8.Dto.EmployeeDto;
import com.likelion.Practice.Week8.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    List<EmployeeDto> list = new ArrayList<EmployeeDto>();
    @PostMapping("/employee")
    public ResponseEntity<EmployeeDto> getEmployeeDto(@RequestBody @Valid EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.getEmployeeDto(employeeDto));
    }
}
