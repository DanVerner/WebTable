<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 12.04.2017
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Таблица</title>
      <script src="/resources/jquery-latest.js"></script>
      <script src="/resources/jquery.tablesorter.js" type="text/javascript" rel="script"></script>
      <script src="/resources/sort.js" type="text/javascript" rel="script"></script>
  </head>
  <body>
  <h2>User table!</h2>
  <table border="1" id="myTable" class="tablesorter">
      <thead>
        <tr>
            <th>Фамилия</th>
            <th>Возраст</th>
            <th>Рост</th>
            <th>Вес</th>
        </tr>
      </thead>
      <tbody>
    <c:forEach items="${personsList}" var="person">
        <tr>
            <td><c:out value="${person.lastName}"></c:out></td>
            <td><c:out value="${person.age}"></c:out></td>
            <td><c:out value="${person.height}"></c:out></td>
            <td><c:out value="${person.weight}"></c:out></td>
        </tr>
    </c:forEach>
      </tbody>
  </table>
  <table>
      <tr>
          <td id = "label"></td>
          <td id = "count"></td>
      </tr>
  </table>

  <button onclick="count(5)">Средний рост</button>
  <button onclick="count(7)">Средний вес</button>
  </body>
</html>
