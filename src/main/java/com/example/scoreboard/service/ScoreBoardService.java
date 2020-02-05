package com.example.scoreboard.service;

import com.example.scoreboard.model.PlayerRecord;
import com.example.scoreboard.repo.ScoreBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service("scoreBoardService")
public class ScoreBoardService {

    private ScoreBoardRepository scoreBoardRepository;

    @Autowired
    public ScoreBoardService(ScoreBoardRepository scoreBoardRepository) {
        this.scoreBoardRepository = scoreBoardRepository;
    }


    public List<PlayerRecord> getAllRecords() {
        return scoreBoardRepository.findAll();
    }


    public PlayerRecord savePlayerRecord(PlayerRecord playerRecord) {
        scoreBoardRepository.save(playerRecord);
        return playerRecord;
    }



}
