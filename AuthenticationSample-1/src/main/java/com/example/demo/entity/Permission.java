package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private EPermission name;
	
	@ManyToMany(mappedBy = "permissions")
	Collection<Role> roleList = new ArrayList<Role>();

	public Permission() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EPermission getName() {
		return name;
	}

	public void setName(EPermission name) {
		this.name = name;
	}

	public Collection<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Collection<Role> roleList) {
		this.roleList = roleList;
	}

	
}