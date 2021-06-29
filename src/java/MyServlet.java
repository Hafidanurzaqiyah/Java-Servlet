import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import library java untuntuk java servlet

public class MyServlet extends HttpServlet { //class Httpservlet

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) //protected processRequest dengan parameter (HttpServletRequest request, HttpServletResponse response) yang dibuat secara otomatis saat menambahkan/membuat file baru servlet
            throws ServletException, IOException { //ServketExcaption untuk peringatan juka terjadi error saat diruning
        response.setContentType("text/html;charset=UTF-8"); //response error servlet
        try (PrintWriter out = response.getWriter()) { //jika tidak error maka akan menampulkan text
            out.println("<title>ITATS</title>"); //menampilkan titel pada halaman web dengan nama ITATS        
            out.println("<h2>INSTITUT TEKNOLOGI ADHI TAMA SURABAYA</h2>"); //menampilkan kalimat pada conten web dengan kelimat INSTITUT TEKNOLOGI ADHI TAMA SURABAYA
        } finally { //terakhir
            out.close(); //close/tutup
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
