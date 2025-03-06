package com.app.parcial.service;

import com.app.parcial.entity.Player;
import com.app.parcial.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing operations related to players.
 * This class provides methods to retrieve, create, update, and delete players.
 */
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    /**
     * Retrieves all players from the database.
     *
     * @return A list of all players.
     */
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    /**
     * Creates a new player and saves it to the database.
     *
     * @param player The player object to be created.
     * @return The created player object.
     */
    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    /**
     * Updates an existing player in the database.
     * If the player does not exist, it will be created.
     *
     * @param player The player object to be updated.
     * @return The updated player object.
     */
    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    /**
     * Deletes a player from the database by its unique identifier.
     *
     * @param id The unique identifier of the player to be deleted.
     */
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}