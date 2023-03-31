package com.bezkoder.spring.login.controllers;

import com.bezkoder.spring.login.models.Transaction;
import com.bezkoder.spring.login.repository.TransactionRepository;
import com.bezkoder.spring.login.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")

public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/date-ajout")
    public List<Transaction> getDateAjout() {
        return transactionRepository.dateAjout();
    }

    @GetMapping("/vente_integre")
    public int getType(){
        return transactionRepository.name().size();
    }
    @GetMapping("/nbTransaction")
    public int getNombre(){
        return transactionRepository.nbTransaction().size();
    }
    @GetMapping("/non_selectionee")
    public int getNonSelectionnee(){
        return transactionRepository.non_selectionee().size();
    }
    @GetMapping("/services")
    public int getServices(){
        return transactionRepository.services().size();
    }
    @GetMapping("/service_apre_vente")
    public int getServiceApreVente(){
        return transactionRepository.service_apre_vente().size();
    }

    @PostMapping("/create")
    public Transaction create(@RequestBody Transaction transaction) {
        return transactionService.creer(transaction);
    }

    @GetMapping("/read")
    public List<Transaction> read() {
        return transactionService.lire();
    }

    @PutMapping("/update/{id}")
    public Transaction update(@PathVariable Long id, @RequestBody Transaction transaction) {
        return transactionService.modifier(id, transaction);
    }

    @DeleteMapping("/delete/{id}")
    public String detete(@PathVariable Long id) {
        return transactionService.supprimer(id);
    }

}
