package com.zubayer.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zubayer.entity.Opdoheader;
import com.zubayer.entity.pk.OpdoheaderPK;

import jakarta.transaction.Transactional;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Repository
public interface OpdoheaderRepo extends JpaRepository<Opdoheader, OpdoheaderPK> {

	public Optional<Opdoheader> findByXdornumAndXtypeAndXstaffAndZid(Integer xdornum, String xtype, Integer xstaff, Integer zid);

	public Optional<Opdoheader> findByXdornumAndXtypeAndXwhAndZid(Integer xdornum, String xtype, Integer xwh, Integer zid);

	public Optional<Opdoheader> findByXdornumAndXtypeAndZid(Integer xdornum, String xtype, Integer zid);

	public Optional<Opdoheader> findByXdornumAndXstatusimAndZid(Integer xdornum, String xstatusim, Integer zid);

	public List<Opdoheader> findAllByXordernumAndXtypeAndXdorrefAndXstatusimAndZid(Integer xordernum, String xtype, Integer xdorref, String xstatusim, Integer zid);
	public List<Opdoheader> findAllByXordernumAndXtypeAndXdorrefAndZid(Integer xordernum, String xtype, Integer xdorref, Integer zid);

	@Transactional
	@Procedure(name = "SO_transferSalesToIM")
	public void SO_transferSalesToIM(@Param("zid") Integer zid, @Param("email") String email, @Param("screen") String screen, @Param("dornum") Integer dornum);

	@Transactional
	@Procedure(name = "SO_transferSalesToAR")
	public void SO_transferSalesToAR(@Param("zid") Integer zid, @Param("email") String email, @Param("screen") String screen, @Param("dornum") Integer dornum);

	@Transactional
	@Procedure(name = "SO_createAD_DOfromDO")
	public void SO_createAD_DOfromDO(@Param("zid") Integer zid, @Param("email") String email, @Param("screen") String screen, @Param("dornum") Integer dornum);

	@Transactional
	@Procedure(name = "SO_updateInvoice")
	public void SO_updateInvoice(@Param("zid") Integer zid, @Param("email") String email, @Param("xdornum") Integer dornum);

	public List<Opdoheader> findAllByXordernumAndXstatusimAndZid(Integer xordernum, String xstatusim, Integer zid);
}
