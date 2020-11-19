package lk.lochana.ems.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "image")
public class Image {
    @Id
    @Column(name = "image_id", length = 10)
    private String imageId;
    @Column(length = 45)
    private String caption;
    private String desciption;
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "event_id", referencedColumnName = "event_id", nullable = false)
    private Event event;
}
