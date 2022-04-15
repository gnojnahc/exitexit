package erp.exit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import erp.exit.domain.InfoItemVO;
import erp.exit.domain.LotVO;
import erp.exit.mapper.LotMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LotServiceImpl implements LotService {
	
	LotMapper mapper;
	
	//등록
	@Override
	public void register(LotVO vo) {
		mapper.register(vo);
	}
	
	//검색내역 목록
	@Override
	public List<LotVO> searchList() {
		return mapper.searchList();
	}
	
	//등록할때 자재코드 검색
	@Override
	public InfoItemVO codeSearch(String code) {
		return mapper.codeSearch(code);
	}
	
}
