package lk.lochana.ems.Service;

import lk.lochana.ems.Dto.EmpDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface EmployeeService {

    void saveEmp(EmpDto dto) throws IOException;
}
