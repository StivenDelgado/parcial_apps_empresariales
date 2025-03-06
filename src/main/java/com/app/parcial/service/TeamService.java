package com.app.parcial.service;

import com.app.parcial.entity.Team;
import com.app.parcial.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing operations related to teams.
 * This class provides methods to create, retrieve, update, and delete teams.
 */
@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    /**
     * Creates a new team and saves it to the database.
     *
     * @param team The team object to be created.
     * @return The created team object.
     */
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    /**
     * Retrieves all teams from the database.
     *
     * @return A list of all teams.
     */
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    /**
     * Updates an existing team in the database.
     * If the team does not exist, it will be created.
     *
     * @param team The team object to be updated.
     * @return The updated team object.
     */
    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }

    /**
     * Deletes a team from the database by its unique identifier.
     *
     * @param id The unique identifier of the team to be deleted.
     */
        public void deleteTeam(Long id) {
                teamRepository.deleteById(id);
        }
}