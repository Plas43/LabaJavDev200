package servlets;

import model.Client;
import model.SelectBean;
import model.UpdateBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ViewList extends HttpServlet {

    @EJB
    SelectBean bean;

    @Override           // TODO what to do with address ArrayList
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        List<Client> clients;       // TODO 6/10 make variable more general?
        String request = req.getParameter("request");

//        if (request.equals("getAll")) {
//            clients = bean.getAllClients(); // TODO 5/10 make sure correct, add specific client search
//        }
//
//        else if (request.equals("filterPhysical")) {
//            clients = bean.getPhysical();
//        }
//
//        else if (request.equals("filterJudicial")) {
//            clients = bean.getJudicial();
//        }
//
//        else if (request.equals("filterByName")) {
//            clients = bean.getByName(req.getParameter("text"));
//        }
//
//        else if (request.equals("filterByAddress")) {
//            clients = bean.getByAddress(req.getParameter("text"));
//        }
        ////////////

        res.setContentType("text/html");        // TODO 8/10 necessary?

        // Hello
        // Hello
        PrintWriter out = res.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <title>Список клиентов</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <table border=\"1\">");
        out.println("        <th>Client ID</th>");
        out.println("        <th>Client name</th>");
        out.println("        <th>Date added</th>");
        out.println("        <th>Address</th>");
        out.println("");

//        for (Client client : clients) {
//            out.println("        <s:forEach items=\"${allStudents}\" var=\"stud\">");
//            out.println("           <tr>");
//            out.println("                <td>" + client.getClientid() + "</td>");
//            out.println("                <td>" + client.getClient_name() + "</td>");
//            out.println("                <td>" + client.getAdded() + "</td>");
//            out.println("                <td>" + client.getAddress() + "</td>");
//
//            out.println("           <tr>");
//            out.println("       </s:forEach>");
//            out.println("           <tr>");
//
//            // TODO what with option value?
////            out.println("       <form method="GET" action="index.php?action=contact_agent">;
////            out.println("           <select name=\"\" id=\"type\">");
////            out.println("               <option value=\"\">Юридическое лицо</option>");
////            out.println("               <option value=\"\">Физическое лицо</option>");
////            out.println("           </select>");
////            out.println("           <input type=\"submit\" value=\"Submit\">");
////            out.println("       </form>");
//
////                </tr>
////        </s:forEach>
//
//        }

        ////////////

        out.flush();

        RequestDispatcher dispatcher =          // TODO make sure servletContext ok
                getServletContext().getRequestDispatcher("/results.html");
        dispatcher.forward(req, res);
    }
}
