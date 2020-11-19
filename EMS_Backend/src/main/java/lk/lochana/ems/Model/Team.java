package lk.lochana.ems.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "team")
public class Team implements Serializable {
    @Id
    @Column(name = "team_id", nullable = false, length = 10)
    private String teamId;
    @Column(name = "team_name", nullable = false, length = 25)
    private String teamName;
    private String description;
}
