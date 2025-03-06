package com.app.parcial.service;

import com.app.parcial.entity.Match;
import com.app.parcial.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing operations related to matches.
 * This class provides methods to retrieve, create, update, and delete matches.
 */
@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    /**
     * Retrieves all matches from the database.
     *
     * @return A list of all matches.
     */
    public List<Match> findAll() {
        return matchRepository.findAll();
    }

    /**
     * Creates a new match and saves it to the database.
     *
     * @param match The match object to be created.
     * @return The created match object.
     */
    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    /**
     * Updates an existing match in the database.
     * If the match does not exist, it will be created.
     *
     * @param match The match object to be updated.
     * @return The updated match object.
     */
    public Match updateMatch(Match match) {
        return matchRepository.save(match);
    }

    /**
     * Deletes a match from the database by its unique identifier.
     *
     * @param id The unique identifier of the match to be deleted.
     */
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}