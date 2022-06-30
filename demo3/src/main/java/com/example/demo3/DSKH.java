package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DSKH extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<customer> customerList = new ArrayList<customer>();
        customerList.add(new customer("1","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/68/30/58/68305815cd224bfa8626a89516af2fe5.jpg"));
        customerList.add(new customer("2","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/06/b3/e6/06b3e60e3b932162b2bf9c166940e176.jpg"));
        customerList.add(new customer("3","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/68/30/58/68305815cd224bfa8626a89516af2fe5.jpg"));
        customerList.add(new customer("4","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/68/30/58/68305815cd224bfa8626a89516af2fe5.jpg"));
        customerList.add(new customer("4","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/89/38/08/893808564664968eb14dc765855ab377.jpg"));
        req.setAttribute("customerList",customerList);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
