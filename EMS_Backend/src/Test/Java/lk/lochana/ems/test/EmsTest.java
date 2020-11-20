package lk.lochana.ems.test;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EmsTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String paswrd="kamal123";
        String encodedpaswrd=encoder.encode(paswrd);
        System.out.println(encodedpaswrd);
    }
}
