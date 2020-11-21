package lk.lochana.ems.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class JwtResponse {

    private String jwt;
    private String email;
    private List<String> roles;
}
