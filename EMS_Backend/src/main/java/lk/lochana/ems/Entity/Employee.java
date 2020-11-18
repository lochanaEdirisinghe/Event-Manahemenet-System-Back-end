package lk.lochana.ems.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "employee")
public class Employee {
    @Id
    @Column(name= "emp_id",length = 45)
    private String empId;
    @Column(length = 20, name = "first_name")
    private String firstName;
    @Column(length = 20, name = "last_name")
    private String lastName;
    @Column(length = 45, name = "reg_code",nullable = false, unique = true)
    private String regCode;
    @Column(length = 100, nullable = false, unique = true)
    private String password;
    @Column(length = 10)
    private int contact;
    @Column(length = 45)
    private String address01;
    @Column(length = 45)
    private String address02;
    @Column(length = 45, nullable = false, unique = true)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dob;
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

}
