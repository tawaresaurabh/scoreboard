package com.example.scoreboard.repo;

import com.example.scoreboard.model.PlayerRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("scoreBoardRepository")
public interface ScoreBoardRepository  extends JpaRepository<PlayerRecord, Integer> {

    Optional<PlayerRecord> findByPlayerName(String playerName);
    boolean existsPlayerRecordByPlayerName(String playerName);
    List<PlayerRecord> findByOrderByPointsAsc();
    List<PlayerRecord> findByOrderByPointsDesc();


}
