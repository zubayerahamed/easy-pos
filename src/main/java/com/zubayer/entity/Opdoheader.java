package com.zubayer.entity;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.zubayer.entity.pk.OpdoheaderPK;
import com.zubayer.enums.SubmitFor;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Data
@Entity
@Table(name = "opdoheader")
@IdClass(OpdoheaderPK.class)
@EqualsAndHashCode(callSuper = true)
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "SO_transferSalesToIM", procedureName = "SO_transferSalesToIM", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "zid", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "email", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "screen", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "dornum", type = Integer.class), 
	}),
	@NamedStoredProcedureQuery(name = "SO_transferSalesToAR", procedureName = "SO_transferSalesToAR", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "zid", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "email", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "screen", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "dornum", type = Integer.class), 
	}),
	@NamedStoredProcedureQuery(name = "SO_createAD_DOfromDO", procedureName = "SO_createAD_DOfromDO", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "zid", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "email", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "screen", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "dornum", type = Integer.class), 
	}), 
	@NamedStoredProcedureQuery(name = "SO_updateInvoice", procedureName = "SO_updateInvoice", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "zid", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "email", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "xdornum", type = Integer.class), 
	}), 
})
public class Opdoheader extends AbstractModel<String> {

	private static final long serialVersionUID = -517137872273158089L;

	@Id
	@Basic(optional = false)
	@Column(name = "zid")
	private Integer zid;

	@Id
	@Basic(optional = false)
	@Column(name = "xdornum")
	private Integer xdornum;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	@Column(name = "xdate")
	private Date xdate;

	@Column(name = "xcus")
	private Integer xcus;

	@Column(name = "xwh")
	private Integer xwh;

	@Column(name = "xref", length = 25)
	private String xref;

	@Column(name = "xlineamt")
	private BigDecimal xlineamt;

	@Column(name = "xdiscp")
	private BigDecimal xdiscp;

	@Column(name = "xdiscp1")
	private BigDecimal xdiscp1;

	@Column(name = "xdiscp2")
	private BigDecimal xdiscp2;

	@Column(name = "xtotamt")
	private BigDecimal xtotamt;

	@Column(name = "xstatus", length = 25)
	private String xstatus;

	@Column(name = "xstatusim", length = 25)
	private String xstatusim;

	@Column(name = "xstatusar", length = 25)
	private String xstatusar;

	@Column(name = "xordernum")
	private Integer xordernum;

	@Column(name = "xdoreqnum")
	private Integer xdoreqnum;

	@Column(name = "xstaff")
	private Integer xstaff;

	@Column(name = "xsadd", length = 200)
	private String xsadd;

	@Column(name = "xnote", length = 200)
	private String xnote;

	@Column(name = "xmadd", length = 200)
	private String xmadd;

	@Column(name = "xdorref")
	private Integer xdorref;

	@Column(name = "xtotcost")
	private BigDecimal xtotcost;

	@Column(name = "xtype", length = 25)
	private String xtype;

	@Column(name = "xscreen")
	private String xscreen;

	@Column(name = "xorigin")
	private String xorigin;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "xsubmittime")
	private Date xsubmittime;

	@Column(name = "xstaffsubmit")
	private Integer xstaffsubmit;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	@Column(name = "xdatereq")
	private Date xdatereq;

	@Column(name= "xstaffreq")
	private Integer xstaffreq;

	@Column(name= "xstafford")
	private Integer xstafford;

	@Column(name = "xitemtype", length = 25)
	private String xitemtype;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	@Column(name = "xdatear")
	private Date xdatear;

	@Transient
	private String reqStaffName;

	@Transient
	private String ordStaffName;

	@Transient
	private String customer;

	@Transient
	BigDecimal creditLimit;

	@Transient
	private String store;

	@Transient
	private String staff;

	@Transient
	private String orderEmployee;

	@Transient
	private String reqEmployee;

	@Transient
	private SubmitFor submitFor = SubmitFor.UPDATE;

	public static Opdoheader getSO17DefaultInstance() {
		Opdoheader obj = new Opdoheader();
		obj.setSubmitFor(SubmitFor.INSERT);
		obj.setXdiscp(BigDecimal.ZERO);
		obj.setXlineamt(BigDecimal.ZERO);
		obj.setXtotamt(BigDecimal.ZERO);
		obj.setXstatus("Open");
		obj.setXstatusar("Open");
		obj.setXstatusim("Open");
		obj.setXdate(new Date());
		obj.setXtype("Direct Order");
		return obj;
	}

	public static Opdoheader getSO18DefaultInstance() {
		Opdoheader obj = new Opdoheader();
		obj.setSubmitFor(SubmitFor.INSERT);
		obj.setXdiscp(BigDecimal.ZERO);
		obj.setXdiscp1(BigDecimal.ZERO);
		obj.setXdiscp2(BigDecimal.ZERO);
		obj.setXlineamt(BigDecimal.ZERO);
		obj.setXtotamt(BigDecimal.ZERO);
		obj.setXstatus("Open");
		obj.setXstatusar("Open");
		obj.setXstatusim("Open");
		obj.setXdate(new Date());
		obj.setXtype("From Order");
		return obj;
	}

	public static Opdoheader getSO23DefaultInstance() {
		Opdoheader obj = new Opdoheader();
		obj.setSubmitFor(SubmitFor.INSERT);
		obj.setXdiscp(BigDecimal.ZERO);
		obj.setXdiscp1(BigDecimal.ZERO);
		obj.setXdiscp2(BigDecimal.ZERO);
		obj.setXlineamt(BigDecimal.ZERO);
		obj.setXtotamt(BigDecimal.ZERO);
		obj.setXstatus("Open");
		obj.setXstatusar("Open");
		obj.setXstatusim("Open");
		obj.setXdate(new Date());
		obj.setXtype("Additional Invoice");
		return obj;
	}

	public static Opdoheader getAD17DefaultInstance() {
		Opdoheader obj = new Opdoheader();
		obj.setSubmitFor(SubmitFor.INSERT);
		obj.setXdiscp(BigDecimal.ZERO);
		obj.setXdiscp1(BigDecimal.ZERO);
		obj.setXdiscp2(BigDecimal.ZERO);
		obj.setXlineamt(BigDecimal.ZERO);
		obj.setXtotamt(BigDecimal.ZERO);
		obj.setXstatus("Open");
		obj.setXstatusar("Open");
		obj.setXstatusim("Open");
		obj.setXdate(new Date());
		obj.setXtype("Additional Invoice");
		return obj;
	}

	public boolean showAdditionalInvoiceBtn(Integer delays) {
		if(delays == null || delays == 0) return false;

		if(this.getXdornum() == null) return false;
		if(this.getXdate() == null) return false;

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date currentDate = cal.getTime();

		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DAY_OF_MONTH, - (delays));
		Date allowedDate = cal2.getTime();

		if(this.getXdate().after(allowedDate) && this.getXdate().before(currentDate)) return true;

		return false;
	}
}
