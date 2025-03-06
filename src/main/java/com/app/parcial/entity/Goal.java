package com.app.parcial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

/**
 * Represents a goal in the system.
 * A goal is scored by a player during a specific match and is recorded with the minute it occurred.
 */
@Entity
@Table(name = "goal")
public class Goal {

    /**
     * Default constructor for the Goal class.
     */
    public Goal() {}

    /**
     * Unique identifier for the goal.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The minute in the match when the goal was scored.
     */
    @Column(nullable = false)
    private int minute;

    /**
     * The player who scored the goal.
     */
    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    /**
     * The match in which the goal was scored.
     */
    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    /**
     * Gets the unique identifier of the goal.
     *
     * @return The unique identifier of the goal.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the goal.
     *
     * @param id The unique identifier of the goal.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the minute in the match when the goal was scored.
     *
     * @return The minute when the goal was scored.
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the minute in the match when the goal was scored.
     *
     * @param minute The minute when the goal was scored.
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * Gets the player who scored the goal.
     *
     * @return The player who scored the goal.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the player who scored the goal.
     *
     * @param player The player who scored the goal.
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Gets the match in which the goal was scored.
     *
     * @return The match in which the goal was scored.
     */
    public Match getMatch() {
        return match;
    }

    /**
     * Sets the match in which the goal was scored.
     *
     * @param match The match in which the goal was scored.
     */
    public void setMatch(Match match) {
        this.match = match;
    }
}