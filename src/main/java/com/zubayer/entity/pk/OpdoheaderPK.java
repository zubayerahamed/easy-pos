package com.zubayer.entity.pk;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpdoheaderPK implements Serializable {

	private static final long serialVersionUID = 7170642612530042605L;
	private Integer zid;
	private Integer xdornum;
}
