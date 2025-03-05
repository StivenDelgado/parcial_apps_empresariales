package com.app.parcial.service;

import com.app.parcial.entity.League;
import com.app.parcial.entity.Player;
import com.app.parcial.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {

    @Autowired
    private LeagueRepository leagueRepository;

    public List<League> findAll() {
        return leagueRepository.findAll();
    }

    public League createLeague(League league) {
        return leagueRepository.save(league);
    }

    public League updateLeague(League league) {
        return leagueRepository.save(league);
    }

    public void deleteLeague(Long id) {
        leagueRepository.deleteById(id);
    }
}
