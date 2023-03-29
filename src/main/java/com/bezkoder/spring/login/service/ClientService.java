package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.models.Client;

import java.util.List;

public interface ClientService {
    Client creer(Client client);
    List<Client> lire();
    Client modifier(Long id, Client client);
    String supprimer(Long id);
}
