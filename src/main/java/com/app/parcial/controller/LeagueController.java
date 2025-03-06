package com.app.parcial.controller;

import com.app.parcial.entity.League;
import com.app.parcial.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling league-related operations.
 * This controller provides endpoints to retrieve, create, update, and delete leagues.
 */
@RestController
@RequestMapping("/api/league")
public class LeagueController {

    @Autowired
    private LeagueService leagueService;

    /**
     * Retrieves all leagues from the database.
     *
     * @return A list of all leagues.
     */
    @GetMapping("/all")
    public List<League> getAllLeagues() {
        return leagueService.findAll();
    }

    /**
     * Creates a new league and saves it to the database.
     *
     * @param league The league object to be created, provided in the request body.
     * @return The created league object.
     */
    @PostMapping("/create")
    public League createLeague(@RequestBody League league) {
        return leagueService.createLeague(league);
    }

    /**
     * Updates an existing league in the database.
     * If the league does not exist, it will be created.
     *
     * @param league The league object to be updated, provided in the request body.
     * @return The updated league object.
     */
    @PutMapping("/updated")
    public League updateLeague(@RequestBody League league) {
        return leagueService.updateLeague(league);
    }

    /**
     * Deletes a league from the database by its unique identifier.
     *
     * @param id The unique identifier of the league to be deleted, provided as a path variable.
     */
    @DeleteMapping("/delete/{id}")
    public void deleteLeague(@PathVariable Long id) {
        leagueService.deleteLeague(id);
    }
}