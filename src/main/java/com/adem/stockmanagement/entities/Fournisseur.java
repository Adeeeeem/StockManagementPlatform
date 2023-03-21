package com.adem.stockmanagement.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "fournisseurs")
public class Fournisseur
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	@NotEmpty(message = "* Please provide a name")
	private String name;

	@Column(name = "logo")
	@NotEmpty(message = "* Please provide a logo")
	private String logo;

	@Column(name = "email")
	@Email(message = "* Please provide a valid Email")
	@NotEmpty(message = "* Please provide an email")
	private String email;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "adresse")
	private String adresse;

	public Fournisseur()
	{}

	public Fournisseur(String name, String logo, String email, String telephone, String adresse)
	{
		this.name = name;
		this.logo = logo;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
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

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public String getAdresse()
	{
		return adresse;
	}

	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}

	@Override
	public String toString()
	{
		return "Fournisseur [id=" + id + ", name=" + name + ", logo=" + logo + ", email=" + email + ", telephone=" + telephone + ", adresse=" + adresse + "]";
	}
}