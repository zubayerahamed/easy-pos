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
public class XscreensPK implements Serializable {

	private static final long serialVersionUID = -2290891229849926260L;

	private Integer zid;
	private String xscreen;
}
