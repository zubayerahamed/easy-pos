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
@NoArgsConstructor
@AllArgsConstructor
public class OpdodetailPK implements Serializable {

	private static final long serialVersionUID = -3927287313005522970L;
	private Integer zid;
	private Integer xdornum;
	private Integer xrow;
}
