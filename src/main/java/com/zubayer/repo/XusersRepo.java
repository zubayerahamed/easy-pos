package com.zubayer.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zubayer.entity.Xusers;
import com.zubayer.entity.pk.XusersPK;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Repository
public interface XusersRepo extends JpaRepository<Xusers, XusersPK>{


	public List<Xusers> findByZemailAndXpasswordAndZactive(String zemail, String xpassword, Boolean zactive);

	public Optional<Xusers> findByZemailAndZid(String zemail, Integer zid);
}
