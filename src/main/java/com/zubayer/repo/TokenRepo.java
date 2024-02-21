package com.zubayer.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zubayer.entity.Token;

/**
 * @author Zubayer Ahamed
 * @since Nov 26, 2023
 */
public interface TokenRepo extends JpaRepository<Token, Long> {

	@Query(value = "SELECT t FROM Token t INNER JOIN Xusers u ON t.zemail = u.zemail WHERE u.zemail = :zemail AND (t.expired = false OR t.revoked = false)")
	List<Token> findAllValidTokenByUser(String zemail);

	Optional<Token> findByToken(String token);
}
