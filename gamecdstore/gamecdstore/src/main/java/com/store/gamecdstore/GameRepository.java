package com.store.gamecdstore;

import com.store.gamecdstore.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
