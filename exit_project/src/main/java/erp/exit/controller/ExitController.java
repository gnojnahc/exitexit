package erp.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import erp.exit.domain.MemberVO;
import erp.exit.service.AccountService;
import erp.exit.service.InformationService;
import erp.exit.service.LoginService;
import erp.exit.service.LoginServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/account/*")
public class ExitController {
	
	public AccountService accountService;
	public LoginService loginService; 
	
	@GetMapping("/login")
	public String login() {
		log.info("로그인화면");
		return "/account/Login";
	}
	
	@PostMapping("/login")
	public String login(MemberVO vo) {
		int cnt = loginService.login(vo.getUserId(), vo.getUserPass());
		if(cnt==1) {
			log.info("로그인성공할까나?");
			return "/information/ProductMain";
		}else
			return "/account/Login";
		

		
		
		
		
	}
	
	@GetMapping("/create")
	public String create() {
		log.info("회원가입화면");
		return "/account/Create";
	}
	
	
	@PostMapping("/create")
	public String createPost(MemberVO vo) {
		
		log.info("회원가입할랭 ㅋ");
		log.info("create:"+vo);
		
		accountService.create(vo);
		return "/account/Login";
	}
	
}
