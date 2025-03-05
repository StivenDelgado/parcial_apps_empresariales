package com.app.parcial.controller;

import com.app.parcial.entity.League;
import com.app.parcial.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/league")
public class LeagueController {

    @Autowired
    private LeagueService leagueService;

    @GetMapping("/all")
    public List<League> getAllLeagues() {
        return leagueService.findAll();
    }

    @PostMapping("/create")
    public League createLeague(@RequestBody League league) {
        return leagueService.createLeague(league);
    }

    @PutMapping("/updated")
    public League updateLeague(@RequestBody League league) {
        return leagueService.updateLeague(league);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLeague(@PathVariable Long id) {
        leagueService.deleteLeague(id);
    }

}
