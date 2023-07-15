package com.omtbs.movieplatform.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Theater")
public class Theater {

    @Id
    @Column(name = "theater_id")
    private Long theaterId;

    @Column(name = "theater_name")
    private String theaterName;

    @ManyToOne
    @JoinColumn(name = "partner_id")
    private Partner partner;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "updated_dt")
    private LocalDateTime updatedDate;

    public Long getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Long theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
