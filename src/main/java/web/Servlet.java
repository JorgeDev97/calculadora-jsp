package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")

public class Servlet extends HttpServlet {
    
    /**
     *
     * @param request
     * @param response
     */
   protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws IOException {
       
        //Leer los parametros
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String op = request.getParameter("operacion");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("operacion:" + op);
        int  result = 0;
        String ope = "";
        switch(op) {
            case "1":
                ope = "Suma";
                result = n1 + n2;
            break;
            case "2":
                ope = "Resta";
                result = n1 - n2;
            break;
            case "3":
                ope = "Multiplicación";
                result = n1 * n2;
            break;
            case "4":
                ope = "Divisón";
                result = n1 / n2;
            break;
        }
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
            out.print("<h1>Resultado</h1>");
            out.print("<br/>");
            out.print("número 1: " + num1);
            out.print("<br/>");
            out.print("número 2: " + num2);
            out.print("<br/>");
            out.print("<br/>");
            out.print("Operación: " + ope);
            out.print("<br/>");
            out.print("<br/>");
            out.print("Resultado: " + result);
        out.print("</body>");
        out.print("</html>");
        
   }
}
