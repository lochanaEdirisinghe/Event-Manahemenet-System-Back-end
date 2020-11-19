package lk.lochana.ems.Dto;


import lk.lochana.ems.Model.Position;
import lk.lochana.ems.Model.Project;
import lk.lochana.ems.Model.Role;
import lk.lochana.ems.Model.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDto {
    private String id;
    private String firstName;
    private String lastName;
    private String companyCode;
    private String email;
    private String password;
    private int contactNo;
    private String address01;
    private String address02;
    private String photo;
    private Position position;
    private Project project;
    private Team team;
}

