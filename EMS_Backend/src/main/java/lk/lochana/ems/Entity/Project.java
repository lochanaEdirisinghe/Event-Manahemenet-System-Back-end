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
@Table(name = "project")
public class Project {
    @Id
    @Column(name = "project_id", nullable = false, length = 10)
    private String projectId;
    @Column(name = "project_name", nullable = false, length = 25)
    private String name;
    private String description;

}
