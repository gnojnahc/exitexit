package erp.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.exit.domain.LotVO;
import erp.exit.service.LotService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/lot/*")
public class LotController {
	
	public LotService service;
	
	// Lot 메인페이지 실행
	@GetMapping("/main")
	public String main(LotVO vo, Model md) {
		log.info("lot 메인 페이지 접속");
		md.addAttribute("list", service.searchList());
		return "/Lot/Main";
	}
	
	//검색내역 팝업실행
	@GetMapping("/reg")
	public String regGet(LotVO vo) {
		log.info("lot 검사결과 입력창 띄움.. ");
		return "Lot/reg";
	}
	
	//lot별 검사결과 등록
	@PostMapping("/reg")
	public String regPost(LotVO vo, Model md) {
		log.info("Lot 자재등록중..");
		service.register(vo);
		return "/Lot/reg";
	}
}
