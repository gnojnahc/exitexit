<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>검사자재 등록</title>
        <link href="/resources/css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    
    <body style="background-color: gray; font-size: 100%">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-2"><b>검사자재 등록</b></h3></div>
                                    <div class="card-body">
                                    
                                        <form action="/inspection/item/reg" method="post">
                                        	<div class="row mb-3">
                                                <div class="col-md-6">
                                                	<div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputinspectionItem" type="text" name="inspectionItem" placeholder="검사항목" required/>
                                                        <label for="inputinspectionItem">검사항목<span class="form-required">*</span></label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control required" id="inputinspectionItemName" type="text" name="inspectionItemName" placeholder="검사항목명" />
                                                        <label for="inputinspectionItemName">검사항목명</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <select class="dataTable-selector" id="inputqua" name="qua" style="width: 100%" onchange="">
                                                        	<option selected value="정성">정성</option>
                                                        	<option value="정량">정량</option>
                                                        </select>
                                                        <label for="inputqua">정성정량</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputsampleWater" type="text" name="sampleWater" placeholder="시료수" maxlength="9" pattern="[0-9]+" />
                                                        <label for="inputsampleWater">시료수<span style="color: red; font-size: 9pt;"> (숫자)</span></label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputac" type="text" name="ac" placeholder="AC" maxlength="9" pattern="[0-9]+" />
                                                        <label for="inputac">AC<span style="color: red; font-size: 9pt;"> (숫자)</span></label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputre" type="text" name="re" placeholder="RE" maxlength="9" pattern="[0-9]+" />
                                                        <label for="inputre">RE<span style="color: red; font-size: 9pt;"> (숫자)</span></label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputusl" type="text" name="usl" placeholder="USL" readonly />
                                                        <label for="inputusl">USL</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputsl" type="text" name="sl" placeholder="SL" readonly />
                                                        <label for="inputsl">SL</label>
                                                    </div>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputlsl" type="text" name="lsl" placeholder="LSL" readonly />
                                                        <label for="inputlsl">LSL</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputucl" type="text" name="ucl" placeholder="UCL" />
                                                        <label for="inputucl">UCL</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputcl" type="text" name="cl" placeholder="CL" />
                                                        <label for="inputcl">CL</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputlcl" type="text" name="lcl" placeholder="LCL" />
                                                        <label for="inputlcl">LCL</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <select class="dataTable-selector" id="inputunit" name="unit" style="width: 100%">
                                                        	<option selected value="1">1</option>
                                                        	<option value="2">2</option>
                                                        </select>
                                                        <label for="inputunit">단위</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputcreationDate" type="date" name="creationDate" placeholder="생성일자" readonly />
                                                        <label for="inputcreationDate">생성일자</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputmodifiedDate" type="date" name="modifiedDate" placeholder="수정일자" value="2999-01-01" readonly />
                                                        <label for="inputmodifiedDate">수정일자</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputdelDate" type="date" name="delDate" placeholder="삭제일" value="2999-01-01" readonly />
                                                        <label for="inputdelDate">삭제일</label>
                                                    </div>
                                                </div>
                                                
												<div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <select class="dataTable-selector" id="inputdisposal" name="disposal" style="width: 100%">
	                                                       	<option selected value="N">N</option>
                                                       	</select>
                                                       	<label for="inputdisposal">폐기여부</label>
                                                   	</div>
                                               	</div>
                                               	
                                               	<div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <textarea class="form-control" id="inputnote" name="note" placeholder="비고" style="height: 160px;"></textarea>
                                                        <label for="inputnote">비고</label>
                                                    </div>
                                                </div>
                                            
                                            <div class="mt-4 mb-0" style="text-align: right;">
                                                <button class="btn btn-primary" type="submit">등록</button>
                                                <a class="btn btn-danger" onclick="window.close()">취소</a>
                                            </div>
                                            <input class="SCheck" type="hidden" value="${ServiceCheck}">
                                            </div>
                                        </form>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
                <br>
                <br>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="/resources/js/scripts.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        
        <script>
        
            var schack = "${ServiceCheck}";
            /* console.log(schack); */

	        $(document).ready(function(){
	        	if(schack == "success") {
	        		alert('등록 되었습니다.');
	        		opener.location.href="/inspection/main";
                    window.close();
	        	};
			});
	        
	        
	        $(document).ready(function(){
	        	$('#inputqua').change(function(e) {
		        	let optval = $('#inputqua option:selected').val();
		        	/* console.log(optval); */
		        	
		        	if(optval == "정량") {
	                    $('#inputac').attr('disabled', 'true');
	                    $('#inputre').attr('disabled', 'true');
	                    $('#inputac').val('');
	                    $('#inputre').val('');
	                    
	                    $('#inputusl').removeAttr('readonly');
	                    $('#inputsl').removeAttr('readonly');
	                    $('#inputlsl').removeAttr('readonly');
		        	}else if(optval == "정성"){
	                    $('#inputusl').attr('readonly', 'true');
	                    $('#inputsl').attr('readonly', 'true');
	                    $('#inputlsl').attr('readonly', 'true');
	                    $('#inputusl').val('');
	                    $('#inputsl').val('');
	                    $('#inputlsl').val('');
	                    
	                    $('#inputac').removeAttr('disabled');
	                    $('#inputre').removeAttr('disabled');
	                }
	        	});
	        });
	        
	        document.getElementById('inputcreationDate').value = new Date().toISOString().substring(0, 10);
        </script>
    </body>
</html>