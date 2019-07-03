<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: zssee
  Date: 2019/6/26
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
            text-align: center
        }

        table {
            margin-right: auto;
            margin-left: auto;
            border: 1px solid seashell;
            padding: 0;
        }

        #lei td {
            background-color: aqua
        }
    </style>
</head>
<body>
<h3>空气质量监测信息库</h3>
<br>
<table>
    <tr>
        <td>
            按区域查询
        </td>
        <td><select name="district">
            <option value="0">不限</option>
            <c:forEach items="${districtList}" var="district">
            <option value="${district.id}">${district.name}</option>
            </c:forEach>
        </select></td>
        <td><input type="button" value="查找"></td>
        <td><a>添加空气质量信息</a></td>
    </tr>
</table>
<br>
<table>
    <tr id="lei">
        <td>序号</td>
        <td>区域</td>
        <td>监测时间</td>
        <td>PM10数据</td>
        <td>PM2.5数据</td>
        <td>监测站</td>
    </tr>
    <c:forEach var="air" items="${pageInfo.list}">
        <tr>
            <td>${air.id}</td>
            <td><a href="javascript:void(0)"> ${air.district.name}</a></td>
            <td><fmt:formatDate value="${air.monitorTime}"/></td>
            <td>${air.pm10}</td>
            <td>${air.pm25}</td>
            <td>${air.monitoringStation}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
