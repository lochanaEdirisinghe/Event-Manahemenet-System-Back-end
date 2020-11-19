package lk.lochana.ems.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "event")
public class Event {
    @Id
    @Column(name = "event_id", length = 10)
    private String eventId;
    @Column(name = "event_title", length = 25)
    private String eventTitle;
    private String Venue;
    private String Destination;
    @Column(name = "no_of_teams")
    private int noOfTeams;
    @Temporal(TemporalType.DATE)
    @Column(name = "start_date")
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "end_date")
    private Date endDate;
    private Boolean famAllow;
    @Temporal(TemporalType.DATE)
    private Date regClosing;
    private String description;
    private boolean liqourAllow;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "team", referencedColumnName = "team_id", nullable = false)
    private Team team;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "event_type", referencedColumnName = "type_id", nullable = false)
    private EventType eventType;




}
