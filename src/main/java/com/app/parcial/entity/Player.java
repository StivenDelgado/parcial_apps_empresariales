package com.app.parcial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

/**
 * Represents a player in the system.
 * A player is associated with a team and can have multiple goals.
 */
@Entity
@Table(name = "player")
public class Player {

    /**
     * Default constructor for the Player class.
     */
    public Player() {}

    /**
     * Unique identifier for the player.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the player.
     */
    @Column(nullable = false)
    private String name;

    /**
     * Position of the player (e.g., forward, midfielder, defender, goalkeeper).
     */
    @Column(nullable = false)
    private String position;

    /**
     * The team to which the player belongs.
     */
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    /**
     * List of goals scored by the player.
     */
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Goal> goals;

    /**
     * Gets the unique identifier of the player.
     *
     * @return The unique identifier of the player.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the player.
     *
     * @param id The unique identifier of the player.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the position of the player.
     *
     * @return The position of the player.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position of the player.
     *
     * @param position The position of the player.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets the team to which the player belongs.
     *
     * @return The team to which the player belongs.
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Sets the team to which the player belongs.
     *
     * @param team The team to which the player belongs.
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    /**
     * Gets the list of goals scored by the player.
     *
     * @return The list of goals scored by the player.
     */
    public List<Goal> getGoals() {
        return goals;
    }

    /**
     * Sets the list of goals scored by the player.
     *
     * @param goals The list of goals scored by the player.
     */
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }
}