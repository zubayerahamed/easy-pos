package com.zubayer.entity;

import org.apache.commons.lang3.StringUtils;

import com.zubayer.entity.pk.XusersPK;
import com.zubayer.enums.SubmitFor;
import com.zubayer.enums.UserRole;

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
@Table(name = "xusers")
@IdClass(XusersPK.class)
@EqualsAndHashCode(callSuper = true)
public class Xusers extends AbstractModel<String> {

	private static final long serialVersionUID = -2612771101344210891L;

	@Id
	@Basic(optional = false)
	@Column(name = "zid")
	private Integer zid;

	@Id
	@Basic(optional = false)
	@Column(name = "zemail", length = 20)
	private String zemail;

	@Column(name = "xpassword", length = 250)
	private String xpassword;

	@Column(name = "xpasswordold", length = 250)
	private String xpasswordold;

	@Column(name = "xwh")
	private Integer xwh;

	@Column(name = "xstaff")
	private Integer xstaff;

	@Column(name = "xprofile", length = 20)
	private String xprofile;

	@Column(name = "xarea")
	private Integer xarea;

	@Column(name = "zactive", length = 1)
	private Boolean zactive = Boolean.TRUE;

	@Column(name = "zadmin", length = 1)
	private Boolean zadmin;

	@Column(name = "xcusview")
	private Integer xcusview;

	@Column(name = "xorgpo")
	private Integer xorgpo;

	@Column(name = "xorgop")
	private Integer xorgop;

	@Column(name = "xorgim")
	private Integer xorgim;

	@Transient
	private String roles;

	@Transient
	private String purOrg;

	@Transient
	private String salesOrg;

	@Transient
	private String inventoryOrg;

	public String getRoles() {
		this.roles = "";
		if (Boolean.TRUE.equals(zadmin))
			roles += UserRole.ZADMIN.getCode() + ',';

		if (StringUtils.isBlank(roles))
			return roles;

		int lastComma = roles.lastIndexOf(',');
		String finalString = roles.substring(0, lastComma);
		roles = finalString;
		return roles;
	}

	@Transient
	private String store;

	@Transient
	private String employee;

	@Transient
	private String area;

	@Transient
	private SubmitFor submitFor = SubmitFor.UPDATE;

	public static Xusers getDefaultInstance() {
		Xusers obj = new Xusers();
		obj.setSubmitFor(SubmitFor.INSERT);
		obj.setZactive(Boolean.FALSE);
		obj.setZactive(Boolean.TRUE);
		obj.setXcusview(30);
		return obj;
	}
}
