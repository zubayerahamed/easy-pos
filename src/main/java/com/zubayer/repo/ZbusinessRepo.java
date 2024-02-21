package com.zubayer.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zubayer.entity.Zbusiness;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Repository
public interface ZbusinessRepo extends JpaRepository<Zbusiness, Integer>{

	public Optional<Zbusiness> findByZidAndZactive(Integer zid, Boolean zactive);
}
