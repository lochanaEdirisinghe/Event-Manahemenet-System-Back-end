package lk.lochana.ems.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "reg_employee")
public class RegisterdEmployee {
    @Id
    @Column(name = "reg_id")
    private String regId;
    @Column(name = "noOf_famMem")
    private int noOfFamMemb;
    private String meelType;
    private String spouse;
    private String nic;
    private String transportMode;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "empployee", referencedColumnName = "emp_id", nullable = false)
    private Employee employee;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "event", referencedColumnName = "event_id", nullable = false)
    private Event event;

}
