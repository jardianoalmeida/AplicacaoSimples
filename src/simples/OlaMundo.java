package simples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OlaMundo")
public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OlaMundo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Escrever alguma coisa
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Ola mundo!");
		out.println("Testando");
		out.println("</body>");
		out.println("</html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
