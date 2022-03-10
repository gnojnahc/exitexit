<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>

	<%@ include file="../includes/header.jsp" %>
	
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">검사 자재 등록</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item">품질관리</li>
                            <li class="breadcrumb-item active">검사자재등록</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-body">
								검사가 필요한 자재를 등록 하거나, 검사 자재 조회가 가능합니다.
                                <br>
                                <!-- <a target="_blank" href="https://datatables.net/">DataTables documentation css & js</a> -->
                            </div>
                        </div>
                        
                        <div>
                        	<a class="btn btn-primary" href="/information/product/reg" target="_blank" onClick="window.open(this.href, '_blank', 'width=600, height=800'); return false;">자재등록</a>
                        </div>
                        	<br>
                        
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
								자재 검색내역
                            </div>
                            <div class="card-body" style="height:500px; overflow:auto">
                                <table id="datatablesSimple" class="dataTable-table" style="font-size: 90%;">
                                    <thead>
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
								            <th>검사여부<span class="yn_select">(Y/N)</span></th>
								            <th>폐기여부<span class="yn_select">(Y/N)</span></th>
										</tr>
                                    </thead>
                                    <tbody>
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
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </main>
	
	<%@ include file="../includes/footer.jsp" %>
		
</html>

