package com.lxit.crm.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 角色属性类
 * 
 * @author Administrator
 *
 */
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int roleId;// 角色id
	private String roleName;// 角色名
	private List<Nav> nav;// 树形菜单

	public Role() {
		super();
	}

	public Role(int roleId, String roleName, List<Nav> nav) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.nav = nav;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Nav> getNav() {
		return nav;
	}

	public void setNav(List<Nav> nav) {
		this.nav = nav;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", nav=" + nav + "]";
	}
}