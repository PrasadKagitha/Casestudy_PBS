package com.omtbs.movieplatform.entities;

import javax.persistence.*;

@Entity
@Table(name = "Screen")
public class Screen {

    @Id
    @Column(name = "screen_id")
    private Long screenId;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    @Column(name = "screen_name")
    private String screenName;

    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
