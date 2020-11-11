package lk.lochana.ems.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "destination")
public class Destination {
    @Id
    @Column(name = "des_id", length = 10)
    private String desId;
    @Column(name = "des_name", length = 20)
    private String desName;
    private int noOfVote;

}
