package model;

import org.springframework.data.repository.CrudRepository;

import model.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
