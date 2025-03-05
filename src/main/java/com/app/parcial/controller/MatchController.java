package com.app.parcial.controller;

import com.app.parcial.entity.Match;
import com.app.parcial.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/all")
    public List<Match> getAllMatches() {
        return matchService.findAll();
    }

    @PostMapping("/create")
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

    @PutMapping("/updated")
    public Match updateMatch(@RequestBody Match match) {
        return matchService.updateMatch(match);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
    }
}
