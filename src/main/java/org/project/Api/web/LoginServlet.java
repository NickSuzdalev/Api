package org.project.Api.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.project.Api.service.api.IUserService;
import org.project.Api.service.factory.UserFactoryService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private final IUserService userService;

    public LoginServlet() {
        this.userService = UserFactoryService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.write(
                "<html>\n" +
                "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Sign Up</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Sign Up</h1>\n" +
                "    <form action=\"Api-1.0-SNAPSHOT/login\" method=\"post\">\n" +
                "        <div>\n" +
                "            <label for=\"login\">Login:</label>\n" +
                "            <input type=\"text\" name=\"login\" id=\"login\" />\n" +
                "        </div>\n" +
                "        <div>\n" +
                "            <label for=\"password\">Password:</label>\n" +
                "            <input type=\"password\" name=\"password\" id=\"password\" />\n" +
                "        </div>\n" +
                "        <div>\n" +
                "            <label for=\"surname\">surname:</label>\n" +
                "            <input type=\"text\" name=\"surname\" id=\"surname\" />\n" +
                "        </div>\n" +
                        "        <div>\n" +
                        "            <label for=\"name\">name:</label>\n" +
                        "            <input type=\"text\" name=\"name\" id=\"name\" />\n" +
                        "        </div>\n" +
                "        <div>\n" +
                "            <label for=\"birthDate\">Birth Date:</label>\n" +
                "            <input type=\"date\" name=\"birthDate\" id=\"birthDate\" />\n" +
                "        </div>\n" +
                "        <input type=\"submit\" value=\"Sign Up\" />\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
