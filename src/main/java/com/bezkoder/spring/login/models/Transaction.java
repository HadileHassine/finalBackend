package com.bezkoder.spring.login.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "TRANSACTION")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_Transaction;
    @Enumerated(EnumType.STRING)
    private TypeTransaction typeTransaction;
    @ManyToOne
    @JoinColumn(name = "id_Produit",referencedColumnName = "id_produit")
    private Produit produit ;


    @ManyToOne
    @JoinColumn(name = "id_Client",referencedColumnName = "id_client")
    private Client client;


    @ManyToOne
    @JoinColumn(name = "id_user",referencedColumnName = "id")
    private User user ;


}