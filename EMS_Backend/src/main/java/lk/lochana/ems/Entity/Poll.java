package lk.lochana.ems.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "poll")
public class Poll {
    @Id
    @Column(name = "poll_id", length = 10)
    private String pollId;
    @Temporal(TemporalType.DATE)
    private Date closingDate;
}
