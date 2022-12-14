package driver;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import model.Address;
import model.Client;
import model.DbManager;
import model.UpdateBean;

import javax.ejb.EJB;

public class Main {

    @EJB
    UpdateBean bean = new UpdateBean();
    public static void main(String[] args) {

        Main main = new Main();

        main.bean.editClient("dummyName");

    }




//
//    private static DbManager dbManager;
//
//    private static  EntityManagerFactory factory;
//    private Estatic ntityManager entityManager;
//    public static void main(String[] args) {
//        Client client = new Client(1);
//
//        // TODO check if address already exists? (client too)
//        EntityTransaction transaction1 = entityManager.getTransaction();
//        transaction1.begin();
//        entityManager.persist(address);
//        transaction1.commit();
//    }
}
