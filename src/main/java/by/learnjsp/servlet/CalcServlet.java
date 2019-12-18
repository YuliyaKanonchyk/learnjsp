package by.learnjsp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calc")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String type = req.getParameter("type");
        double oper = 0;

        switch (type) {
            case "sum":
                oper = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            default: throw new IllegalArgumentException("Bad!");
        }


        req.setAttribute("result", oper);
        req.getRequestDispatcher("/calc.jsp").forward(req, resp);

    }
}
