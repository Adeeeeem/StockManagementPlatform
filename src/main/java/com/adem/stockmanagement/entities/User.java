package com.adem.stockmanagement.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "users")
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "email")
	@Email(message = "* Please provide a valid Email")
	@NotEmpty(message = "* Please provide an email")
	private String email;

	@Column(name = "password")
	@Length(min = 5, message = "* Your password must have at least 5 characters")
	@NotEmpty(message = "* Please provide your password")
	private String password;

	@Column(name = "first_name")
	@NotEmpty(message = "* Please provide your first name")
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty(message = "* Please provide your last name")
	private String lastName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set <Role> roles;

	public User()
	{}

	public User(int id, String email, String password, String firstName, String lastName, Set <Role> roles)
	{
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Set <Role> getRoles()
	{
		return roles;
	}

	public void setRoles(Set <Role> roles)
	{
		this.roles = roles;
	}

	@Override
	public String toString()
	{
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", roles=" + roles + "]";
	}
}