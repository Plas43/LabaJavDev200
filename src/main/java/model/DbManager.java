package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import javax.ejb.Singleton;
import java.time.LocalDate;
import java.util.List;

@Singleton
public class DbManager {
    private static DbManager dbManager;

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public DbManager() {       // TODO maybe other way of connection?
        factory = Persistence.createEntityManagerFactory("LabaJavDev200"); // TODO not sure
        entityManager = factory.createEntityManager();
    }

    public static DbManager getManager() {
        if (dbManager == null) {
            dbManager = new DbManager();
        }

        return dbManager;
    }

    public void createClient(String clientid) {
        Client client = new Client(clientid);
        Address address = new Address();

        // TODO check if address already exists? (client too)

        EntityTransaction transaction1 = entityManager.getTransaction();
        transaction1.begin();
        entityManager.persist(client);
        transaction1.commit();

        EntityTransaction transaction2 = entityManager.getTransaction();
        transaction2.begin();
        entityManager.persist(address);
        transaction2.commit();

    }

    public void getAllClients() {

//        List<Client> clients = entityManager.createQuery("SELECT * FROM db_example").getResultList();
//
////        Client client = entityManager.find(Client.class, 1);
//        return clients;
    }

    public void getPhysical() {
//        List<Client> clients = entityManager.createQuery("SELECT * FROM clients WHERE type = 'Физическое лицо'").getResultList();
//        return clients;
    }

    public void getJudicial() {
//        List<Client> clients = entityManager.createQuery("SELECT * FROM clients WHERE type = 'Юридическое лицо'").getResultList();
//        return clients;
    }

    public void getByName(String partOfName) {      // TODO mandatory this, query to get partial String match
//        List<Client> clients = entityManager.createQuery().getResultList();
//        return clients;
    }

    public void getByAddress(String partOfAddress) {      // TODO mandatory this, query to get partial String match
//        List<Client> clients = entityManager.createQuery().getResultList();
//        return clients;
    }

    // TODO really manual clientid?
//    public Client createClient(int clientid, String client_name, String type, LocalDate added, List<Address> addresses) {
//        Client client = new Client(clientid, client_name, type, added, addresses);
//        entityManager.persist(client);
//        return client;  // TODO needed?
//    }


}
