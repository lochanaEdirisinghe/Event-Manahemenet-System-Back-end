package lk.lochana.ems.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "event_type")
public class EventType {
    @Id
    @Column(name = "type_id", nullable = false, length = 10)
    private String typeId;
    @Column(name = "type_name", nullable = false, length = 25)
    private String typeName;
    private String description;
}
