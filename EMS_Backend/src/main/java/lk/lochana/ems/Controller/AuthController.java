package lk.lochana.ems.Controller;

import lk.lochana.ems.Dto.EmpDto;
import lk.lochana.ems.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    EmployeeService  employeeService;

    @GetMapping
    public String login(){
        return "Hello";
    }

    @PostMapping
    public void saveEmp(@RequestBody EmpDto dto){
        employeeService.saveEmp(dto);
    }
}
