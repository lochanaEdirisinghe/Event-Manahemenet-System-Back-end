package lk.lochana.ems.Service.Impl;

import lk.lochana.ems.Dto.EmpDto;
import lk.lochana.ems.Entity.Employee;
import lk.lochana.ems.Repository.EmployeeRepository;
import lk.lochana.ems.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepo;


    @Override
    public void saveEmp(EmpDto dto) {
        Employee employee = new Employee(dto.getEmpId(), dto.getEmpName());
        employeeRepo.save(employee);
    }
}
