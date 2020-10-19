package com.ecom.sportyshoe.security;

public enum ApplicationUserPermission {
	USER_READ("user:read"),
	USER_WRITE("user:write"),
	USER_UPDATE("user:update"),
	USER_DELETE("user:delete"),
	ADMIN_READ("admin:read"),
	ADMIN_WRITE("admin:write"),
	ADMIN_UPDATE("admin:update"),
	ADMIN_DELETE("admin:delete");
	
	
	private final String permission;

	ApplicationUserPermission(String permission){
		this.permission = permission;
	}
	
	public String getPermission() {
		return permission;
	}
	
	
}
