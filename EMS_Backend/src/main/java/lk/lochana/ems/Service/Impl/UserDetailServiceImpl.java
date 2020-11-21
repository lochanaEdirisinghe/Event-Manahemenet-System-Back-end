package lk.lochana.ems.Service.Impl;

import lk.lochana.ems.Model.Employee;
import lk.lochana.ems.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    public EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee = employeeRepository.findByUsername(username).get();


        if(employee==null){
            throw new UsernameNotFoundException("Could not find employee");
        }
        return employee;
    }
}
