package com.game.repository;

import com.game.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.data.domain.Pageable;
import java.util.Date;
import java.util.List;

public interface PlayerRepository extends CrudRepository<Player,Long> {
    Page <Player> findPlayersByNameContains (String name,Pageable page);
    List<Player> findPlayersByBirthdayBetween (Date date1, Date date2);

    //Page<Player> findAll(Pageable page);

    Page<Player> findAll(Specification<Player> specification, Pageable pageable);

    List<Player> findAll(Specification<Player> specification);
}
