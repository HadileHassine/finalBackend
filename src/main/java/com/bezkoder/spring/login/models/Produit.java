package com.bezkoder.spring.login.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "PRODUIT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Produit;
    private String nom;
    private String categorie;
    private String description;
    private Integer prix;
    private Integer code_produit;
    private String commentaire ;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_creation;

    @OneToMany(mappedBy = "produit")
    private List<Transaction> transactions;

    public void setProduit(Transaction transaction) {
    }
}
