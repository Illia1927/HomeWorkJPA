package mateAcademy;

import mateAcademy.patients.Patient;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class PatientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws StackOverflowError, IOException, ServletException {
        response.setContentType("text/html");
        Patient patient = new Patient();
        patient.setName("Anton");
        patient.setBirthsDate(LocalDate.now());
        request.setAttribute("patient", patient);

        PrintWriter out = response.getWriter();
        out.println("<h1>" + "Moroz" + "</h1>");
        request.getRequestDispatcher("patients/info.jsp").forward(request, response);
    }
}
