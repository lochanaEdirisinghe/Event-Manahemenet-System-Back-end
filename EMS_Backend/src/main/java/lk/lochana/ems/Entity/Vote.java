package lk.lochana.ems.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Table(name = "vote")
public class Vote {
    @Id
    @Column(name = "vote_id", length = 10)
    private String voteId;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "empployee", referencedColumnName = "emp_id", nullable = false)
    private Employee employee;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "destination", referencedColumnName = "des_id", nullable = false)
    private Destination destination;
}
