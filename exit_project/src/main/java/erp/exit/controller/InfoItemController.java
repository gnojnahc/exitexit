package erp.exit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import erp.exit.domain.InfoItemDTO;
import erp.exit.domain.InfoItemVO;
import erp.exit.service.InfoItemService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@RequestMapping("/infoinspectitem/*")
@Controller
public class InfoItemController {
	
	public InfoItemService service;
	
	// 검사자재 등록&조회 페이지 실행
	@GetMapping("/main")
	public String registerMainGet(InfoItemVO vo, Model md) {
		log.info("InfoItem infoitem_M 페이지 접속");
		md.addAttribute("list", service.list());
		return "/infoinspectitem/InfoItemMain";
	}
	
	// 자재 등록 팝업실행
	@GetMapping("/infoinspectitem/reg")
	public String registerGet(InfoItemVO vo, Model md) {
		log.info("InfoItem 자재 등록창 띄움 ..");
		return "/infoinspectitem/InfoItemReg";
	}
	
	// 자재 등록기능
	@PostMapping("/infoinspectitem/reg")
	public String registerPost(InfoItemVO vo, Model md) {
		log.info("Information 자재 등록중..");
		service.register(vo);
		
		md.addAttribute("ServiceCheck", "success");
		
		return "/infoinspectitem/InfoItemReg";
	}
	
	// 자재 삭제폼 팝업실행
	@GetMapping("/infoinspectitem/del")
	public String deleteGet(InfoItemVO vo, Model md) {
		log.info("infoitem 자재 삭제창 띄움 ..");
		
		return "/infoinspectitem/InfoItemDel";
	}
	
	// 자재 제품코드 조회
		@PostMapping("/infoinspectitem/searchcode")
		public String searchcodePost(InfoItemVO vo, Model md) {
			log.info("infoitem 자재 조회중..");
			
			InfoItemVO delVO = service.codeSearch(vo.getCode());
			List<InfoItemVO> delVO2 = service.codeSearch2(vo.getCode());
			
			if(delVO2.size() == 0) {
				md.addAttribute("ServiceCheck", "none");
			}else {
				md.addAttribute("vo", delVO);
			}
			
			return "/infoinspectitem/InfoItemDel";
		}
		
		// 자재 수정 팝업실행
		@GetMapping("/infoinspectitem/mod")
		public String modifyGet(InfoItemVO vo, Model md) {
			log.info("infoitem 자재 수정창 띄움 ..");
			
			return "/infoinspectitem/InfoItemMod";
		}
		
		// 자재 수정기능
		@PostMapping("/infoinspectitem/mod")
		public String modifyPost(InfoItemVO vo, Model md) {
			log.info("infoitem 자재 수정중..");
			
			service.modify(vo);
			
			md.addAttribute("ServiceCheck", "success");
			
			return "/infoinspectitem/InfoItemMod";
		}
		
		// 자재수정 코드 조회
		@PostMapping("/infoinspectitem/modsearchcode")
		public String modSearchCodePost(InfoItemVO vo, Model md) {
			log.info("infoitem 자재 조회중..");
			
			InfoItemVO delVO = service.codeSearch(vo.getCode());
			List<InfoItemVO> delVO2 = service.codeSearch2(vo.getCode());
			
			if(delVO2.size() == 0) {
				md.addAttribute("ServiceCheck", "none");
			}else {
				md.addAttribute("ServiceCheck", "searchOK");
				md.addAttribute("vo", delVO);
			}
			
			return "/infoinspectitem/InfoItem";
		}
		
		// 테이블 Ajax 검색 조회
		@GetMapping("/infoinspectitem/getSearchList")
		@ResponseBody
		public List<InfoItemDTO> getSearchList(InfoItemDTO dto, Model md) {
			log.info("infoitem 테이블 Ajax검색 진행");
			
			List<InfoItemDTO> searchList = service.selectSearchList(dto.getType(), dto.getKeyword());
			
			return searchList;
		}
		
	}
	
	
	
	


