package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private String ip;

    private String mac;
    private String model;
    private String address;

    private Client client;
}
