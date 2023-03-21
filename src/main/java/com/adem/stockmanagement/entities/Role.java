package com.adem.stockmanagement.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "roles")
public class Role
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	@NotEmpty(message = "* Please provide a name")
	private String name;

	public Role()
	{}

	public Role(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Role [id=" + id + ", name=" + name + "]";
	}
}