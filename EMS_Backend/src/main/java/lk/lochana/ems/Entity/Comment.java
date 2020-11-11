package lk.lochana.ems.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "comment_id", length = 10)
    private String commentId;
    private String comment;
    @Temporal(TemporalType.TIME)
    private Date time;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "employee", referencedColumnName = "emp_id", nullable = false)
    private Employee employee;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "poll", referencedColumnName = "poll_id", nullable = false)
    private Poll poll;



}
