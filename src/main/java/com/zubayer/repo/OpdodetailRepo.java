package com.zubayer.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zubayer.entity.Opdodetail;
import com.zubayer.entity.pk.OpdodetailPK;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Repository
public interface OpdodetailRepo extends JpaRepository<Opdodetail, OpdodetailPK>{

	public List<Opdodetail> findAllByXdornumAndZid(Integer xdornum, Integer zid);

	@Query(value = "select isnull(max(COALESCE(xrow,0)) + 1, 1) from opdodetail where zid=?1 and xdornum=?2", nativeQuery = true)
	public Integer getNextAvailableRow(Integer zid, Integer xdoreqnum);

	@Query(value = "select isnull(sum(COALESCE(xlineamt,0)), 0) from opdodetail where zid=?1 and xdornum=?2", nativeQuery = true)
	public BigDecimal getTotalLineAmount(Integer zid, Integer xdoreqnum);
}
