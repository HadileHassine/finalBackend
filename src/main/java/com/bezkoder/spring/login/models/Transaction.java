package com.bezkoder.spring.login.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

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
    private Integer montant;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_ajout ;

    private  Integer sommeTransaction;

    @Enumerated(EnumType.STRING)
    private MethodePaiement methodePaiement;
    @Enumerated(EnumType.STRING)
    private StatutTransaction statutTransaction;
    @Enumerated(EnumType.STRING)
    private TypeTransaction typeTransaction;

    private String produit ;

    private String client;


    @ManyToOne
    @JoinColumn(name = "id_user",referencedColumnName = "id")
    @JsonIgnore
    private User user ;


}
