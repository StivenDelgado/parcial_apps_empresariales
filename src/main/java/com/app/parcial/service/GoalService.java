package com.app.parcial.service;

import com.app.parcial.entity.Goal;
import com.app.parcial.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing operations related to goals.
 * This class provides methods to retrieve, create, update, and delete goals.
 */
@Service
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;

    /**
     * Retrieves all goals from the database.
     *
     * @return A list of all goals.
     */
    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    /**
     * Creates a new goal and saves it to the database.
     *
     * @param goal The goal object to be created.
     * @return The created goal object.
     */
    public Goal createGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    /**
     * Updates an existing goal in the database.
     * If the goal does not exist, it will be created.
     *
     * @param goal The goal object to be updated.
     * @return The updated goal object.
     */
    public Goal updateGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    /**
     * Deletes a goal from the database by its unique identifier.
     *
     * @param id The unique identifier of the goal to be deleted.
     */
    public void deleteGoal(Long id) {
        goalRepository.deleteById(id);
    }
}