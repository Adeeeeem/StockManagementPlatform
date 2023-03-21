package com.adem.stockmanagement.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "produits")
public class Produit
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "libelle")
	@NotEmpty(message = "* Please provide a libelle")
	private String libelle;

	@Column(name = "photo_face")
	@NotEmpty(message = "* Please provide a photo face")
	private String photoFace;

	@Column(name = "photo_profil")
	@NotEmpty(message = "* Please provide a photo profil")
	private String photoProfil;

	@Column(name = "prix")
	@NotEmpty(message = "* Please provide a price")
	private double prix;

	@Column(name = "description")
	private String description;

	@Column(name = "quantite_stock")
	@NotEmpty(message = "* Please provide a quantite stock")
	private int quantiteStock;

	@Column(name = "prix_promotion")
	private double prixPromotion;

	@Column(name = "date_expiration")
	private Date dateExpiration;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_fournisseur", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Fournisseur fournisseur;

	public Produit()
	{}

	public Produit(String libelle, String photoFace, String photoProfil, double prix, String description, int quantiteStock, double prixPromotion, Date dateExpiration)
	{
		this.libelle = libelle;
		this.photoFace = photoFace;
		this.photoProfil = photoProfil;
		this.prix = prix;
		this.description = description;
		this.quantiteStock = quantiteStock;
		this.prixPromotion = prixPromotion;
		this.dateExpiration = dateExpiration;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getLibelle()
	{
		return libelle;
	}

	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

	public String getPhotoFace()
	{
		return photoFace;
	}

	public void setPhotoFace(String photoFace)
	{
		this.photoFace = photoFace;
	}

	public String getPhotoProfil()
	{
		return photoProfil;
	}

	public void setPhotoProfil(String photoProfil)
	{
		this.photoProfil = photoProfil;
	}

	public double getPrix()
	{
		return prix;
	}

	public void setPrix(double prix)
	{
		this.prix = prix;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getQuantiteStock()
	{
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock)
	{
		this.quantiteStock = quantiteStock;
	}

	public double getPrixPromotion()
	{
		return prixPromotion;
	}

	public void setPrixPromotion(double prixPromotion)
	{
		this.prixPromotion = prixPromotion;
	}

	public Date getDateExpiration()
	{
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration)
	{
		this.dateExpiration = dateExpiration;
	}

	public Fournisseur getFournisseur()
	{
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur)
	{
		this.fournisseur = fournisseur;
	}

	@Override
	public String toString()
	{
		return "Produit [id=" + id + ", libelle=" + libelle + ", photoFace=" + photoFace + ", photoProfil=" + photoProfil + ", prix=" + prix + ", description=" + description + ", quantiteStock=" + quantiteStock + ", prixPromotion=" + prixPromotion + ", dateExpiration=" + dateExpiration + "]";
	}
}