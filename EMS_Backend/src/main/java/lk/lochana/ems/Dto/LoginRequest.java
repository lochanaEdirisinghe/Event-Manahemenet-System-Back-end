package lk.lochana.ems.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class LoginRequest {

    private String username;
    private String password;
}
