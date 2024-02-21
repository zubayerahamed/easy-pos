package com.zubayer.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.zubayer.entity.pk.CacusPK;
import com.zubayer.enums.SubmitFor;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Data
@Entity
@Table(name = "cacus")
@IdClass(CacusPK.class)
@EqualsAndHashCode(callSuper = true)
public class Cacus extends AbstractModel<String> {

	private static final long serialVersionUID = 635166591174188883L;

	@Id
	@Basic(optional = false)
	@Column(name = "zid")
	private Integer zid;

	@Id
	@Basic(optional = false)
	@Column(name = "xcus")
	private Integer xcus;

	@Column(name = "xorg", length = 100)
	private String xorg;

	@Column(name = "xorgop")
	private Integer xorgop;

	@Column(name = "xcontact", length = 50)
	private String xcontact;
	
	@Column(name = "xphone", length = 50)
	private String xphone;

	@Column(name = "xemail", length = 50)
	private String xemail;
	
	@Column(name = "xmadd", length = 200)
	private String xmadd;

	@Column(name = "xsadd", length = 200)
	private String xsadd;

	@NotNull(message = "Area must not be empty")
	@Column(name = "xarea")
	private Integer xarea;

	@Column(name = "xcatcus", length = 100)
	private String xcatcus;

	@Column(name = "xcrlimit")
	private BigDecimal xcrlimit;

	@Column(name = "xcrlimitm")
	private BigDecimal xcrlimitm;

	@Column(name = "xcrlimity")
	private BigDecimal xcrlimity;

	@Column(name = "xisover")
	private Boolean xisover;

	@Column(name = "xcusold", length = 10)
	private String xcusold;

	@Column(name = "xtype", length = 10)
	private String xtype;

	@Column(name = "xstaff")
	private Integer xstaff;

	@Column(name = "zactive")
	private Boolean zactive;

	@Column(name = "xbin", length = 100)
	private String xbin;

	@Column(name = "xnid", length = 100)
	private String xnid;

	@Column(name = "xissms")
	private Boolean xissms;

	@Column(name = "xsmsnos", length = 200)
	private String xsmsnos;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	@Column(name = "xdatejoin")
	private Date xdatejoin;

	@Transient
	private String area;

	@Transient
	private String employee;

	@Transient
	private BigDecimal currentBalance;

	@Transient
	private SubmitFor submitFor = SubmitFor.UPDATE;

	public static Cacus getDefaultInstance() {
		Cacus obj = new Cacus();
		obj.setZactive(Boolean.TRUE);
		obj.setXcrlimit(BigDecimal.ZERO);
		obj.setXcrlimitm(BigDecimal.ZERO);
		obj.setXcrlimity(BigDecimal.ZERO);
		obj.setXisover(Boolean.FALSE);
		obj.setSubmitFor(SubmitFor.INSERT);
		obj.setXissms(Boolean.TRUE);
		obj.setXtype("Customer");
		obj.setXdatejoin(new Date());
		return obj;
	}
}
