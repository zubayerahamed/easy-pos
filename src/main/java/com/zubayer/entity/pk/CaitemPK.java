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
public class CaitemPK implements Serializable {

	private static final long serialVersionUID = 7864980734784025813L;

	private Integer zid;
	private Integer xitem;
}
