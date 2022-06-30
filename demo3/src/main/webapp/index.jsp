<%@ page import="com.example.demo3.customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }
    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
</style>
<div>
    <%
    List<customer> customerList = new ArrayList<customer>();
        customerList.add(new customer("1","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/68/30/58/68305815cd224bfa8626a89516af2fe5.jpg"));
        customerList.add(new customer("2","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/06/b3/e6/06b3e60e3b932162b2bf9c166940e176.jpg"));
        customerList.add(new customer("3","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/68/30/58/68305815cd224bfa8626a89516af2fe5.jpg"));
        customerList.add(new customer("4","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/68/30/58/68305815cd224bfa8626a89516af2fe5.jpg"));
        customerList.add(new customer("5","Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/236x/89/38/08/893808564664968eb14dc765855ab377.jpg"));
    request.setAttribute("customerList",customerList);
    %>
</div>
<body>
    <table border="0">
        <caption><h1>Danh sách khách hàng</h1></caption>
        <thead>

        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="a" items="${customerList}">
            <tr><td>${a.STT}</td>
                <td>${a.name}</td>
                <td>${a.date}</td>
                <td>${a.address}</td>
                <td><img src="${a.img}"></td></tr>
        </c:forEach>
        </tbody>
    </table>

</body>

</html>