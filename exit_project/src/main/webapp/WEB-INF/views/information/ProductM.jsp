<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자재등록 페이지</title>
</head>
<body>

   <h3>검사자재등록</h3>
   
   <form action="/information/register" method="post">
		<tr>
            <th>자재코드</th>
            	<td><input type="text" name="code"></td><br>
            <th>자재명</th>
            	<td><input type="text" name="codeName"></td><br>
            <th>구매자</th>
            	<td><input type="text" name="buyer"></td><br>
            <th>구매자명</th>
            	<td><input type="text" name="buyerName"></td><br>
            <th>구매부서</th>
            	<td><input type="text" name="purchasing"></td><br>
            <th>구매부서명</th>
            	<td><input type="text" name="purchasingName"></td><br>
            <th>구매업체</th>
            	<td><input type="text" name="buyCompany"></td><br>
            <th>구매업체명</th>
            	<td><input type="text" name="buyCompanyName"></td><br>
            <th>수입검사자</th>	
            	<td><input type="text" name="inspectperson"></td><br>
            <th>현재고</th>
            	<td><input type="text" name="currentInventory"></td><br>
            <th>구매단가</th>
            	<td><input type="text" name="price"></td><br>
            <th>검사여부</th>
            	<td><input type="text" name="inspect"></td><br>
            <th>폐기여부</th>
            	<td><input type="text" name="disuse"></td><br>
		</tr>
			<br>
         <button type="submit">등록</button>
   </form>
	
	
	<table border="1" style="text-align: center;">
		<tr>
			<th>자재코드</th>
            <th>자재명</th>
            <th>구매자</th>
            <th>구매자명</th>
            <th>구매부서</th>
            <th>구매부서명</th>
            <th>구매업체</th>
            <th>구매업체명</th>
            <th>수입검사자</th>	
            <th>현재고</th>
            <th>구매단가</th>
            <th>검사여부</th>
            <th>폐기여부</th>
		</tr>
		
		<br><br>
		
		<c:forEach var="vo" items="${list}">
			<tr>
				<td>${vo.code}</td>
				<td>${vo.codeName}</td>
				<td>${vo.buyer}</td>
				<td>${vo.buyerName}</td>
				<td>${vo.purchasing}</td>
				<td>${vo.purchasingName}</td>
				<td>${vo.buyCompany}</td>
				<td>${vo.buyCompanyName}</td>
				<td>${vo.inspectperson}</td>
				<td>${vo.currentInventory}</td>
				<td>${vo.price}</td>
				<td>${vo.inspect}</td>
				<td>${vo.disuse}</td>
			</tr>
		</c:forEach>
	
	</table>
	
	
</body>
</html>