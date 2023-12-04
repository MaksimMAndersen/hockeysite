package com.example.coursework.services;

import com.example.coursework.models.game.GameStats;
import com.example.coursework.repositories.GameStatsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameStatsService {
    private GameStatsRepository gameStatsRepository;
    public List<GameStats> getAllGameStats() {
        return gameStatsRepository.findAll();
    }
}
