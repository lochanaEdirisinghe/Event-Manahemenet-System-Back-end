package lk.lochana.ems.Service.Impl;
import lk.lochana.ems.Dto.EmpDto;
import lk.lochana.ems.Repository.EmployeeRepository;
import lk.lochana.ems.Repository.RoleRepository;
import lk.lochana.ems.Service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepo;

    @Autowired
    ModelMapper modelMapper;
    


    @Override
    public void saveEmp(EmpDto dto) throws IOException {

    }

   /* @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return employeeRepo.findOneByUsername(username);
    }*/
}
