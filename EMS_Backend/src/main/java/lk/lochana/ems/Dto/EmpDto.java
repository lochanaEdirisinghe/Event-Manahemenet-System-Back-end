package lk.lochana.ems.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDto {
    private String empId;
    private String firstName;
    private String lastName;
    private String regCode;
    private String password;
    private int contact;
    private String address01;
    private String address02;
    private String email;
    private String dob;
}
