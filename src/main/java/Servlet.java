import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="hello", urlPatterns = {"/api/*"})
public class Servlet extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(Servlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request got");
        resp.getWriter().write("Bla bla bla");
    }
}
