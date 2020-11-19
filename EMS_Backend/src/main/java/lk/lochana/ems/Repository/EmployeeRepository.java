package lk.lochana.ems.Repository;

import lk.lochana.ems.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

        /*@Query(value = "select * from Employee where username =:name", nativeQuery = true)
        Optional<Employee> findByUsername(@Param("name") String name);*/

        Optional<Employee> findByUsername(String name);
}
