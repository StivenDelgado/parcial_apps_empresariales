package com.app.parcial.service;

import com.app.parcial.entity.League;
import com.app.parcial.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing operations related to leagues.
 * This class provides methods to retrieve, create, update, and delete leagues.
 */
@Service
public class LeagueService {

    @Autowired
    private LeagueRepository leagueRepository;

    /**
     * Retrieves all leagues from the database.
     *
     * @return A list of all leagues.
     */
    public List<League> findAll() {
        return leagueRepository.findAll();
    }

    /**
     * Creates a new league and saves it to the database.
     *
     * @param league The league object to be created.
     * @return The created league object.
     */
    public League createLeague(League league) {
        return leagueRepository.save(league);
    }

    /**
     * Updates an existing league in the database.
     * If the league does not exist, it will be created.
     *
     * @param league The league object to be updated.
     * @return The updated league object.
     */
    public League updateLeague(League league) {
        return leagueRepository.save(league);
    }

    /**
     * Deletes a league from the database by its unique identifier.
     *
     * @param id The unique identifier of the league to be deleted.
     */
    public void deleteLeague(Long id) {
        leagueRepository.deleteById(id);
    }
}