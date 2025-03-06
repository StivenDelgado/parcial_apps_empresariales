package com.app.parcial.controller;

import com.app.parcial.entity.Match;
import com.app.parcial.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling match-related operations.
 * This controller provides endpoints to retrieve, create, update, and delete matches.
 */
@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    /**
     * Retrieves all matches from the database.
     *
     * @return A list of all matches.
     */
    @GetMapping("/all")
    public List<Match> getAllMatches() {
        return matchService.findAll();
    }

    /**
     * Creates a new match and saves it to the database.
     *
     * @param match The match object to be created, provided in the request body.
     * @return The created match object.
     */
    @PostMapping("/create")
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

    /**
     * Updates an existing match in the database.
     * If the match does not exist, it will be created.
     *
     * @param match The match object to be updated, provided in the request body.
     * @return The updated match object.
     */
    @PutMapping("/updated")
    public Match updateMatch(@RequestBody Match match) {
        return matchService.updateMatch(match);
    }

    /**
     * Deletes a match from the database by its unique identifier.
     *
     * @param id The unique identifier of the match to be deleted, provided as a path variable.
     */
    @DeleteMapping("/delete/{id}")
    public void deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
    }
}