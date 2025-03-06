package com.app.parcial.controller;

import com.app.parcial.entity.Goal;
import com.app.parcial.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling goal-related operations.
 * This controller provides endpoints to retrieve, create, update, and delete goals.
 */
@RestController
@RequestMapping("/api/goal")
public class GoalController {

    @Autowired
    private GoalService goalService;

    /**
     * Retrieves all goals from the database.
     *
     * @return A list of all goals.
     */
    @GetMapping("/all")
    public List<Goal> getAllGoals() {
        return goalService.getAllGoals();
    }

    /**
     * Creates a new goal and saves it to the database.
     *
     * @param goal The goal object to be created, provided in the request body.
     * @return The created goal object.
     */
    @PostMapping("/create")
    public Goal createGoal(@RequestBody Goal goal) {
        return goalService.createGoal(goal);
    }

    /**
     * Updates an existing goal in the database.
     * If the goal does not exist, it will be created.
     *
     * @param goal The goal object to be updated, provided in the request body.
     * @return The updated goal object.
     */
    @PutMapping("/updated")
    public Goal updateGoal(@RequestBody Goal goal) {
        return goalService.updateGoal(goal);
    }

    /**
     * Deletes a goal from the database by its unique identifier.
     *
     * @param id The unique identifier of the goal to be deleted, provided as a path variable.
     */
    @DeleteMapping("/delete/{id}")
    public void deleteGoal(@PathVariable Long id) {
        goalService.deleteGoal(id);
    }
}