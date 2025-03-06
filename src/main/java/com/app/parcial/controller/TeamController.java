package com.app.parcial.controller;

import com.app.parcial.entity.Team;
import com.app.parcial.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling team-related operations.
 * This controller provides endpoints to retrieve, create, update, and delete teams.
 */
@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    /**
     * Retrieves all teams from the database.
     *
     * @return A list of all teams.
     */
    @GetMapping("/all")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    /**
     * Creates a new team and saves it to the database.
     *
     * @param team The team object to be created, provided in the request body.
     * @return The created team object.
     */
    @PostMapping("/create")
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }

    /**
     * Updates an existing team in the database.
     * If the team does not exist, it will be created.
     *
     * @param team The team object to be updated, provided in the request body.
     * @return The updated team object.
     */
    @PutMapping("/updated")
    public Team updateTeam(@RequestBody Team team) {
        return teamService.updateTeam(team);
    }

    /**
     * Deletes a team from the database by its unique identifier.
     *
     * @param id The unique identifier of the team to be deleted, provided as a path variable.
     */
    @DeleteMapping("/delete/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }
}