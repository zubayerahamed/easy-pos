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
public class CacusPK implements Serializable {

	private static final long serialVersionUID = -4890759628004641140L;

	private Integer zid;
	private Integer xcus;
}
