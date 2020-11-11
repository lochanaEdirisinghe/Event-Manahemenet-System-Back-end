package lk.lochana.ems.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "employees")
public class Employee {
    @Id
    @Column(length = 45)
    private String empId;
    @Column(length = 20)
    private String firstName;
    @Column(length = 20)
    private String lastName;
    @Column(length = 45, nullable = false, unique = true)
    private String regCode;
    @Column(length = 45, nullable = false, unique = true)
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
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "role", referencedColumnName = "id", nullable = false)
    private Role role;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "position", referencedColumnName = "position_id", nullable = false)
    private Position position;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "project", referencedColumnName = "project_id", nullable = false)
    private Project project;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "team", referencedColumnName = "team_id", nullable = false)
    private Team team;

    /*@ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "team", referencedColumnName = "team_id", nullable = false)
    private Team team;*/
}
