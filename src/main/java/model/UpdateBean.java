package model;

import jakarta.persistence.PersistenceContext;

import javax.ejb.Stateless;
import java.time.LocalDate;

@Stateless
public class UpdateBean {

    @PersistenceContext
    DbManager dbManager;

//    public boolean isCyrillic(String text) {
//        return text.matches("[а-яА-Я-.]+") &&    // TODO make sure -. correct
//                text.;
//    }

    public void editClient(String id) {

        dbManager = new DbManager();
        dbManager.createClient(id);
    }

//    public boolean editClient(String action, int clientid, String client_name, String type, LocalDate added,
//                              String ip, String mac, String model, String address) {
//        // TODO logic to check each parameter
//
//        if (action.equals("create")) {
//            // TODO what to do with clientid
//            // TODO how to set address for client?
//            if ((client_name == null || type == null || LocalDate == null || client_name.length() > 100
//                                    || type.length() > 20
//                                    || !type.equalsIgnoreCase("Юридическое лицо")
//                                    || !type.equalsIgnoreCase("Физическое лицо")
//                ||
//                ip == null || mac == null || model == null || address == null
//                        // TODO mandatory correct regex to make 3 characters not one for e.g. zero
//                           || !ip.matches( "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$")
//                           || !mac.matches("^(([0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z])(\\-(?!$)|$)){6}$")     // TODO MANDATORY continue here
//                           || ) {
//                // TODO how to generate error? Also what about date and addresses
//                // TODO make separate error for length and others?
//            }
//
//            dbManager.createClient(int clientid, String client_name, String type, LocalDate added, List<Address> addresses);
//            return true;    // TODO boolean return needed?
//        } // TODO else if
//    }
}
