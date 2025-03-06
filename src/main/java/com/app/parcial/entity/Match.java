package com.app.parcial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

/**
 * Represents a match in the system.
 * A match involves two teams (home and away) and can have multiple goals.
 */
@Entity
@Table(name = "`match`")
public class Match {

    /**
     * Default constructor for the Match class.
     */
    public Match() {}

    /**
     * Unique identifier for the match.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Date when the match took place or is scheduled to take place.
     */
    private String date;

    /**
     * The home team participating in the match.
     */
    @ManyToOne
    @JoinColumn(name = "home_team_id", nullable = false)
    private Team homeTeam;

    /**
     * The away team participating in the match.
     */
    @ManyToOne
    @JoinColumn(name = "away_team_id", nullable = false)
    private Team awayTeam;

    /**
     * List of goals scored in the match.
     */
    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Goal> goals;

    /**
     * Gets the unique identifier of the match.
     *
     * @return The unique identifier of the match.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the match.
     *
     * @param id The unique identifier of the match.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the date of the match.
     *
     * @return The date of the match.
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date of the match.
     *
     * @param date The date of the match.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the home team participating in the match.
     *
     * @return The home team participating in the match.
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * Sets the home team participating in the match.
     *
     * @param homeTeam The home team participating in the match.
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * Gets the away team participating in the match.
     *
     * @return The away team participating in the match.
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * Sets the away team participating in the match.
     *
     * @param awayTeam The away team participating in the match.
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * Gets the list of goals scored in the match.
     *
     * @return The list of goals scored in the match.
     */
    public List<Goal> getGoals() {
        return goals;
    }

    /**
     * Sets the list of goals scored in the match.
     *
     * @param goals The list of goals scored in the match.
     */
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }
}