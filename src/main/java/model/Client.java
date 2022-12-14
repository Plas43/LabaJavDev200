package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Client {
    @Id                         // TODO or other way to generate ID
    private int clientid;        // TODO make static counter or not?

    private String client_name;        // TODO how to limit number of characters?
    private String type;
    private LocalDate added;

    private String address;


    public void setName(String name) {
        client_name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getClientid() {
        return clientid;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getAdded() {
        return added.toString();
    }


    public Client(String clientid) {
        this.clientid = Integer.parseInt(clientid);
    }

    /*
    public Client(int clientid, String client_name, String type) {
        this.clientid = clientid;
        this.client_name = client_name;
        this.type = type;
        added = LocalDate.now();        // TODO make sure this is ok
    }

     */



}
