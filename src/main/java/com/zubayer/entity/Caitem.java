package com.zubayer.entity;

import java.math.BigDecimal;

import com.zubayer.entity.pk.CaitemPK;
import com.zubayer.enums.SubmitFor;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Data
@Entity
@Table(name = "caitem")
@IdClass(CaitemPK.class)
@EqualsAndHashCode(callSuper = true)
public class Caitem extends AbstractModel<String> {

	private static final long serialVersionUID = -4579492106206759411L;

	@Id
	@Basic(optional = false)
	@Column(name = "zid")
	private Integer zid;

	@Id
	@Basic(optional = false)
	@Column(name = "xitem")
	private Integer xitem;

	@Column(name = "xdesc", length = 100)
	private String xdesc;

	@Column(name = "xcatitem", length = 100)
	private String xcatitem;

	@Column(name = "xunit", length = 10)
	private String xunit;

	@Column(name = "xctype", length = 25)
	private String xctype;

	@Column(name = "xcost")
	private BigDecimal xcost;

	@Column(name = "xrate")
	private BigDecimal xrate;

	@Column(name = "xspec", length = 100)
	private String xspec;

	@Column(name = "xcodeold", length = 25)
	private String xcodeold;

	@Column(name = "xissale")
	private Boolean xissale;

	@Column(name = "zactive")
	private Boolean zactive;

	@Column(name = "xtype", length = 10)
	private String xtype;

	@Column(name = "xgitem", length = 100)
	private String xgitem;

	@Column(name = "xsubcat", length = 100)
	private String xsubcat;

	@Column(name = "xpack", length = 100)
	private String xpack;

	@Column(name = "xminqty")
	private BigDecimal xminqty;

	@Transient
	private Integer xwh;
	@Transient
	private String store;
	@Transient
	private BigDecimal xqty;

	@Transient
	private SubmitFor submitFor = SubmitFor.UPDATE;

	public static Caitem getDefaultInstance() {
		Caitem obj = new Caitem();
		obj.setXctype("Weighted Average");
		obj.setXcost(BigDecimal.ZERO);
		obj.setXrate(BigDecimal.ZERO);
		obj.setZactive(Boolean.TRUE);
		obj.setXissale(Boolean.TRUE);
		obj.setSubmitFor(SubmitFor.INSERT);
		obj.setXtype("Item");
		obj.setXminqty(BigDecimal.ZERO);
		return obj;
	}
}
