package lk.lochana.ems.Service.Impl;
import lk.lochana.ems.Dto.EmpDto;
import lk.lochana.ems.Entity.Employee;
import lk.lochana.ems.Entity.Role;
import lk.lochana.ems.Repository.EmployeeRepository;
import lk.lochana.ems.Repository.RoleRepository;
import lk.lochana.ems.Service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepo;

    @Autowired
    ModelMapper modelMapper;
    
    @Autowired
    RoleRepository roleRepository;

    @Override
    public void saveEmp(EmpDto dto) {
        Optional<Role> role = roleRepository.findById(1);
        Employee employee = modelMapper.map(dto, Employee.class);
        employee.setRole(role.get());
        employeeRepo.save(employee);
    }
}
