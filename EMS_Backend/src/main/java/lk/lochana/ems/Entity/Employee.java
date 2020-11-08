package lk.lochana.ems.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "employees",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "empId"),
                @UniqueConstraint(columnNames = "email"),
                @UniqueConstraint(columnNames = "password"),
                @UniqueConstraint(columnNames = "regCode")
        })
public class Employee {
    @Id
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
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "role", referencedColumnName = "id", nullable = false)
    private Role role;
}
