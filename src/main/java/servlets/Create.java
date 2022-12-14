package servlets;

import model.Client;
import model.UpdateBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Create extends HttpServlet {

    @EJB
    UpdateBean bean;

    @Override           // TODO what to do with address ArrayList
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        bean.editClient(req.getParameter("name"));
//        RequestDispatcher dispatcher =          // TODO make sure servletContext ok
//                getServletContext().getRequestDispatcher("/ViewList");
//        dispatcher.forward(req,res);

//        bean.editClient(req.getParameter("action"), req.getParameter("id"), req.getParameter("name"),
//                    req.getParameter("type"), LocalDate.now(), new ArrayList<String>());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

    }

//    private void createClient(int clientid, String client_name, String type) {
//        Client.clients.add(new Client(clientid, client_name, type));        // TODO ok like this?
//    }
}
