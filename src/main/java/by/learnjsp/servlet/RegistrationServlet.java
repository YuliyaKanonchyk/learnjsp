package by.learnjsp.servlet;

import by.learnjsp.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/reg")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.getRequestDispatcher("/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        List<User> users = (List<User>) getServletContext().getAttribute("userList");


        String login = req.getParameter("login");
        String password = req.getParameter("pass");

        user.setLogin(login);
        user.setPassword(password);
        System.out.println(user);
        users.add(user);

        resp.sendRedirect("/main");
    }
}
