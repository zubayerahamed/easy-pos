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
public class XusersPK implements Serializable {

	private static final long serialVersionUID = -9024206548799168071L;

	private Integer zid;
	private String zemail;
}
