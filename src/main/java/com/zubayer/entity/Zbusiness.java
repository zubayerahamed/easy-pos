package com.zubayer.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Data
@Entity
@Table(name = "zbusiness")
@EqualsAndHashCode(callSuper = true)
public class Zbusiness extends AbstractModel<String> {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "zid")
	private Integer zid;

	@NotBlank
	@Column(name = "zorg", length = 50)
	private String zorg;

	@Column(name = "xphone", length = 50)
	private String xphone;

	@NotBlank
	@Column(name = "zname", length = 50)
	private String zname;

	@Column(name = "xemail", length = 50)
	private String xemail;

	@Column(name = "xmadd", length = 200)
	private String xmadd;

	@Column(name = "zpassword", length = 25)
	private String zpassword;

	@Lob
	@Column(name = "xlogo")
	private byte[] xlogo;

	@Column(name = "xfilesize")
	private Integer xfilesize;

	@Column(name = "xdocpath", length = 100)
	private String xdocpath;

	@Column(name = "xdoctypes", length = 200)
	private String xdoctypes;

	@Column(name = "zactive")
	private Boolean zactive;

	@Min(value = 0, message = "Additional invoice allowed days must be greater or equal 0")
	@Column(name = "xaddidelays")
	private Integer xaddidelays;

	@Transient
	private String imageBase64;

	@Transient
	private String zemail;

	@Transient
	private String xpassword;
}
