package erp.exit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import erp.exit.domain.InfoItemDTO;
import erp.exit.domain.InfoItemVO;

public interface InfoItemMapper {
	
	//글등록 하기
	public void register(InfoItemVO vo);
	
	//전체 글목록 가져오기
	public List<InfoItemVO> list();
	
	//검사항목 검색해서 데이터 가져오기
	public InfoItemVO InfoitemSearch(String infoItem);
	public List<InfoItemVO> InfoitemSearch2(String infoItem);
	// 쿼리+ajax 검색기능
	public List<InfoItemDTO> selectSearchList(@Param("type") String type, 
			@Param("keyword") String keyword);	

	//검사항목 확인해서 삭제하기
	public void delBackUpData(String infoItem); //데이터 삭제테이블에 백업
	public void delComplete(String infoItem); //본 데이터 삭제
	
	//수정
	public void modify(InfoItemVO vo);	

}
