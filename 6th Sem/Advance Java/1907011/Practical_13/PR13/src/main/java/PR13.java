
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class PR13 extends HttpServlet{
	private String email;
	private String password;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		email = req.getParameter("email");
		password = req.getParameter("password");
		
		doPost( req,res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter();
		pw.println("<h1> email    : " + this.email + "</h1>");
		pw.println("<h1> Password : " + this.password + "</h1>" );
		
	}

}
