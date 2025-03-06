package com.app.parcial.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

/**
 * Represents a team in the system.
 * A team is associated with a league and can have multiple players.
 */
@Entity
@Table(name = "team")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Team {

    /**
     * Default constructor for the Team class.
     */
    public Team() {}

    /**
     * Unique identifier for the team.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the team.
     */
    @Column(nullable = false)
    private String name;

    /**
     * City where the team is based.
     */
    @Column(nullable = false)
    private String city;

    /**
     * List of players associated with the team.
     */
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Player> players;

    /**
     * The league to which the team belongs.
     */
    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    private League league;

    /**
     * Gets the unique identifier of the team.
     *
     * @return The unique identifier of the team.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the team.
     *
     * @param id The unique identifier of the team.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of the team.
     *
     * @return The name of the team.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the team.
     *
     * @param name The name of the team.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the city where the team is based.
     *
     * @return The city where the team is based.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city where the team is based.
     *
     * @param city The city where the team is based.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the list of players associated with the team.
     *
     * @return The list of players associated with the team.
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Sets the list of players associated with the team.
     *
     * @param players The list of players associated with the team.
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    /**
     * Gets the league to which the team belongs.
     *
     * @return The league to which the team belongs.
     */
    public League getLeague() {
        return league;
    }

    /**
     * Sets the league to which the team belongs.
     *
     * @param league The league to which the team belongs.
     */
    public void setLeague(League league) {
        this.league = league;
    }
}