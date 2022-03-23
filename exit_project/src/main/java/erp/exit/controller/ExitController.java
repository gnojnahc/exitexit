package erp.exit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import erp.exit.domain.MemberVO;
import erp.exit.service.StartService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@SessionAttributes("vo")
@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/account/*")
public class ExitController {
	
	public StartService	service;
	
	@GetMapping("/login")
	public String login(SessionStatus status) {
		log.info("로그인화면");
		status.setComplete();//세션값 초기화
		return "/account/Login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute MemberVO vo, Model md) {
		int cnt = service.login(vo.getUserId(), vo.getUserPass());
		if(cnt==1) {
			md.addAttribute("vo",vo);
			log.info("로그인성공할까나?");
			return "redirect:/information/main";
		}else
			md.addAttribute("check", "fail");
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

		service.create(vo);
		return "/account/Login";
	}
	
}
