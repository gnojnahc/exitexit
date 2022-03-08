package erp.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.exit.domain.ProductVO;
import erp.exit.service.InformationService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/information/*")
public class InformationController {
	
	public InformationService service;
	
	@RequestMapping("/test1")
	public String test1(ProductVO vo, Model md) {
		log.info("Information Register 페이지 접속");
		
		md.addAttribute("list", service.list());
		
		return "/information/data";
	}
	
	@GetMapping("/register")
	public String registerMain(ProductVO vo, Model md) {
		log.info("Information Product_M 페이지 접속");
		
		md.addAttribute("list", service.list());
		
		return "/information/ProductMain";
	}
	
//	@PostMapping("/register")
//	public String registerPost(ProductVO vo, Model md) {
//		log.info("Information Post 제품조회 ..");
//		
//		service.register(vo);
//		
//		md.addAttribute("list", service.list());
//		
//		return "/information/ProductM";
//	}
	
	@GetMapping("/product/reg")
	public String registerGet(ProductVO vo, Model md) {
		log.info("Information 제품등록창 띄움 ..");
		
		return "/information/ProductReg";
	}
	
	@PostMapping("/product/reg")
	public String registerPost(ProductVO vo, Model md) {
		log.info("Information 제품등록중..");
		service.register(vo);
		
		md.addAttribute("ServiceCheck", "success");
		
		return "/information/ProductReg";
	}
	
}


//리다이렉트 메모
//return "redirect:/material/list";

