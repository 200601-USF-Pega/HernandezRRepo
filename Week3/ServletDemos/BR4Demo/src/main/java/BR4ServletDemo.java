import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BR4ServletDemo extends HttpServlet {
	private static final long serialVersionUID = -465940822375880622L;
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("In the get method of the Servlet Uno class");
        resp.setContentType("text/html");
        resp.getWriter().write(
                "<html>" +
                "<body>" +
                "<p>" +
                "Welcome to the get place" +
                "</p>" +
                "</body>" +
                "</html>"
        );
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("In the delete method of servlet uno");
    }
}
