package erp.exit.service;

import java.util.List;

import erp.exit.domain.InfoItemDTO;
import erp.exit.domain.InfoItemVO;
import erp.exit.domain.ProductVO;

public interface InfoItemService {
	
	//등록&리스트
	public void register(InfoItemVO vo);
	public List<InfoItemVO> list();
	
	//삭제 조회
	public InfoItemVO codeSearch(String code, String inspectionItem);
			
	//삭제
	public void delBackUpData(String infoItem); //데이터 삭제테이블에 백업
	public void delComplete(String infoItem); //본 데이터 삭제
	
	//수정
	public void modify(InfoItemVO vo);
	
	//쿼리+ajax 검색기능
	public List<InfoItemDTO> selectSearchList(String type, String keyword);

	//자재코드 자동완성
	public List<InfoItemVO> search(String code);
	
	//검사항목 자동완성
	public List<InfoItemVO> search2(String code,String inspectionItem);
	
}
