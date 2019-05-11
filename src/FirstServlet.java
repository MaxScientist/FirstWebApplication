import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        session.setAttribute("count",count);

            if (count == null){
                session.setAttribute("count",1);
                count=0;
            }
            else {
                session.setAttribute("count",count+1);
            }

//        String name = request.getParameter("name");
//String lastName = request.getParameter("lastname");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
//        pw.println("<h1> Your count is "+count +"</h1>");
//        pw.println("<center><h1> Hello "+ name + " "+lastName+" </h1></center>");

        pw.println("</html>");
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
//        dispatcher.forward(request,response);
    }
}
