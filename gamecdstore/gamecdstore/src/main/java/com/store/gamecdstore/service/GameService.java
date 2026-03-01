package com.store.gamecdstore.service;

import com.store.gamecdstore.model.Game;
import com.store.gamecdstore.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game addNewGame(String title,String genre,Double price,Integer stock){
        Game saved =gameRepository.save(new Game(title,genre,price,stock));
        return saved;
    }
}
