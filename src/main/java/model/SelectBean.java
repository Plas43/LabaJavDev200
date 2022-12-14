package model;

import jakarta.persistence.PersistenceContext;

import java.util.List;

public class SelectBean {

    @PersistenceContext
    DbManager dbManager;

//    public List<Client> getAllClients() {
//        return dbManager.getAllClients();
//    }

//    public List<Client> getPhysical() {
//        return dbManager.getPhysical();
//    }
//
//    public List<Client> getJudicial() {
//        return dbManager.getJudicial();
//    }
//
//    public List<Client> getByName(String partOfName) {
//        return dbManager.getByName(partOfName);
//    }
//
//    public List<Client> getByAddress(String partOfAddress) {
//        return dbManager.getByAddress(partOfAddress);
//    }
}
