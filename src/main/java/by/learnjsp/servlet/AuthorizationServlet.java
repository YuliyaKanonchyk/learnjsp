package by.learnjsp.servlet;

import by.learnjsp.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/auth")
public class AuthorizationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/auth.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = (List<User>) req.getServletContext().getAttribute("userList");

        String login = req.getParameter("login");
        String password = req.getParameter("pass");

        User user = new User(login, password);

        for (User user1 : userList) {
            if (user1.equals(user)) {
                System.out.println(user1);
                req.getSession().setAttribute("currentUser", user1);
                req.getSession().setAttribute("isAuth", true);
                break;
            }
        }
        resp.sendRedirect("/main");
    }
}
