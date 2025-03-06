package com.app.parcial.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

/**
 * Represents a league in the system.
 * A league can have multiple teams associated with it.
 */
@Entity
@Table(name = "league")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class League {

    /**
     * Default constructor for the League class.
     */
    public League() {}

    /**
     * Unique identifier for the league.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the league.
     */
    @Column(nullable = false, length = 200)
    private String name;

    /**
     * List of teams associated with the league.
     */
    @OneToMany(mappedBy = "league", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Team> teams;

    /**
     * Gets the unique identifier of the league.
     *
     * @return The unique identifier of the league.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the league.
     *
     * @param id The unique identifier of the league.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of the league.
     *
     * @return The name of the league.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the league.
     *
     * @param name The name of the league.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of teams associated with the league.
     *
     * @return The list of teams associated with the league.
     */
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Sets the list of teams associated with the league.
     *
     * @param teams The list of teams associated with the league.
     */
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}