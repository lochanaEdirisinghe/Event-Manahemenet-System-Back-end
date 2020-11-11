package lk.lochana.ems.Controller;

import lk.lochana.ems.Dto.EmpDto;
import lk.lochana.ems.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService  employeeService;

    @GetMapping
    public String login(){
        return "Hello";
    }

    @PostMapping
    public void saveEmp( @RequestBody EmpDto dto) throws IOException {
        employeeService.saveEmp(dto);
    }
    /*@RequestParam("photo") MultipartFile photo,*/

}
