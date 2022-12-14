package servlets;

import model.UpdateBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Update extends HttpServlet {

    @EJB
    UpdateBean bean;

    @Override           // TODO what to do with address ArrayList
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        bean.editClient(req.getParameter("name"));
        RequestDispatcher dispatcher =          // TODO make sure servletContext ok
                getServletContext().getRequestDispatcher("/index.html");
        dispatcher.forward(req,res);

//        bean.editClient(req.getParameter("action"), req.getParameter("id"), req.getParameter("name"),
//                    req.getParameter("type"), LocalDate.now(), new ArrayList<String>());
    }

}
