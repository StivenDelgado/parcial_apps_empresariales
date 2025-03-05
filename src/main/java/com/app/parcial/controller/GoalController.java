package com.app.parcial.controller;

import com.app.parcial.entity.Goal;
import com.app.parcial.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goal")
public class GoalController {

    @Autowired
    private GoalService goalService;

    @GetMapping("/all")
    public List<Goal> getAllGoals() {
        return goalService.getAllGoals();
    }

    @PostMapping("/create")
    public Goal createGoal(@RequestBody Goal goal) {
        return goalService.createGoal(goal);
    }

    @PutMapping("/updated")
    public Goal updateGoal(@RequestBody Goal goal) {
        return goalService.updateGoal(goal);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGoal(@PathVariable Long id) {
        goalService.deleteGoal(id);
    }
}
