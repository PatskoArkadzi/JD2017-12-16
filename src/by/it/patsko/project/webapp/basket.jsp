<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>

    <p><b><c:out value="${user.login}"/>, у вас в корзине:</b></p>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Автор</th>
                    <th scope="col">Название</th>
                    <th scope="col">Цена</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${purchases}" var="book">
                    <tr>
                        <td>${book.author}</td>
                        <td>${book.name}</td>
                        <td>${book.price}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>


        <br><br>
            <c:if test="${user!=null}">
                <button id="No action" value="No action" name="No action" class="btn btn-success" disabled>
                    Оформить заказ
                </button>
            </c:if>
        <br><br>

        <div class="row">
            <mytag:paginator count="${size}" step="5" urlprefix="do?command=basket&step=5&start="/>
        </div>


<%@ include file="include/end-html.jsp" %>