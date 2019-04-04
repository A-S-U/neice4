package asu.com.servlet;

import asu.com.entity.MembersInfo;
import asu.com.server.MembersInfoImpl;
import asu.com.server.impl.MembersDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MembersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        MembersInfoImpl membersInfo = new MembersDao();
        List<MembersInfo> membersInfos = membersInfo.MembersInfo();
        request.setAttribute("membersInfos",membersInfo);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
