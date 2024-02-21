package com.zubayer.enums;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
public enum UserRole {

	ZADMIN("ROLE_ZADMIN", "ZAdmin", 0),
	SUBSCRIBER("ROLE_SUBSCRIBER", "Subscriber", 100);

	private String code;
	private String roleName;
	private int priority;

	private UserRole(String code, String roleName, int priority) {
		this.code = code;
		this.roleName = roleName;
		this.priority = priority;
	}

	public String getCode() {
		return code;
	}

	public String getRoleName() {
		return roleName;
	}

	public int getPriority() {
		return priority;
	}
}
