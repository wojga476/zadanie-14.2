import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sprawdzanieTekstu")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tekst = request.getParameter("tekst");

        response.getWriter().println(tekst);
        PrzelicznikTekstu m = new PrzelicznikTekstu();

        response.getWriter().println("Ilość słów: " + m.liczenieSlow(tekst));
        response.getWriter().println("Ilość znaków: " + m.liczenieWszystkichZnakow(tekst));
        response.getWriter().println("Ilość znaków bez spacji: " + m.liczenieZnakowBezSpacji(tekst));
        System.out.println("Polidrom: " + m.sprawdzanieCzyTekstJestPolidromem(tekst));


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
