package lk.lochana.ems.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "employee")
public class Employee implements UserDetails, Serializable {
    @Id
    @Column(name= "emp_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 20, name = "first_name")
    private String firstName;
    @Column(length = 20, name = "last_name")
    private String lastName;
    @Column(length = 45, name = "reg_code",nullable = false)
    private String companyCode;
    @Column(name = "username", length = 45, nullable = false, unique = true)
    private String username;
    @Column(length = 100, nullable = false, unique = true)
    private String password;
    @Column(name = "contact_no", length = 10)
    private long contactNo;
    @Column(length = 45)
    private String address01;
    @Column(length = 45)
    private String address02;
    @Column(name = "enabled")
    private boolean enabled;
    private String photo;
    @JoinTable(name = "emp_roles", joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Role> roles;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "position", referencedColumnName = "position_id", nullable = false)
    private Position position;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "project", referencedColumnName = "project_id", nullable = false)
    private Project project;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "team", referencedColumnName = "team_id", nullable = false)
    private Team team;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (Role role : roles) {
            String name = role.getName().toUpperCase();
            System.out.println("****"+name);
            authorities.add(new SimpleGrantedAuthority(name));
        }

        return authorities;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
