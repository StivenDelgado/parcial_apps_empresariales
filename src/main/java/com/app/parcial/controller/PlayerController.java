package com.app.parcial.controller;

import com.app.parcial.entity.Player;
import com.app.parcial.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling player-related operations.
 * This controller provides endpoints to retrieve, create, update, and delete players.
 */
@RestController
@RequestMapping("/api/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    /**
     * Retrieves all players from the database.
     *
     * @return A list of all players.
     */
    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return playerService.findAll();
    }

    /**
     * Creates a new player and saves it to the database.
     *
     * @param player The player object to be created, provided in the request body.
     * @return The created player object.
     */
    @PostMapping("/create")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    /**
     * Updates an existing player in the database.
     * If the player does not exist, it will be created.
     *
     * @param player The player object to be updated, provided in the request body.
     * @return The updated player object.
     */
    @PutMapping("/updated")
    public Player updatePlayer(@RequestBody Player player) {
        return playerService.updatePlayer(player);
    }

    /**
     * Deletes a player from the database by its unique identifier.
     *
     * @param id The unique identifier of the player to be deleted, provided as a path variable.
     */
    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }
}