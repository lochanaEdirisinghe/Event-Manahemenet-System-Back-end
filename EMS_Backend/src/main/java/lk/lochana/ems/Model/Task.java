package lk.lochana.ems.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "task")
public class Task {
    @Id
    @Column(name = "task_id", length = 10)
    private String taskId;
    @Column(name = "task_name", length = 30)
    private String tastName;
    private Double actualCost;
    private Double budgetCost;
    @Temporal(TemporalType.DATE)
    private Date addDate;
    private String description;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "empployee", referencedColumnName = "emp_id", nullable = false)
    private Employee employee;
}
