package com.ProductionScientifique.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(nullable=false,updatable=false)
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String imageUrl;
    @Column(nullable=false,updatable=false)
    private String professorCode;
    // constructeur
    public Professor(){};
    public Professor(String nom, String prenom, String email, String imageUrl, String professorCode)
    {   this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.imageUrl=imageUrl;
        this.professorCode = professorCode;
    }
    // les accesseurs
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setProfessorCode(String professorCode) {
        this.professorCode = professorCode;
    }

    public String getProfessorCode() {
        return professorCode;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", professorCode='" + professorCode + '\'' +
                '}';
    }
}
