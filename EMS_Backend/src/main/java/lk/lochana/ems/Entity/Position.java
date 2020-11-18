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
@Table(name = "position")
public class Position {
    @Id
    @Column(name = "position_id", nullable = false, length = 10)
    private String positionId;
    @Column(name = "name", nullable = false, length = 25)
    private String name;
}
