package erp.exit.service;

import java.util.List;

import erp.exit.domain.InfoItemVO;
import erp.exit.domain.LotVO;

public interface LotService {
	
	//글 등록하기
	public void register(LotVO vo);
	
	//검사결과 검색내역 가져오기
	public List<LotVO> searchList();
	
	//검사결과 자재코드 검색해서 가져오기
	public InfoItemVO codeSearch(String code);
	
}
