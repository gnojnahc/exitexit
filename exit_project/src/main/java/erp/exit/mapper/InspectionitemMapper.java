package erp.exit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import erp.exit.domain.ItemDTO;
import erp.exit.domain.ItemVO;

public interface InspectionitemMapper {
	
	//글등록 하기
	public void register(ItemVO vo);
	
	//전체 글목록 가져오기
	public List<ItemVO> list();
	
	//검사항목 검색해서 데이터 가져오기
	public ItemVO delSearch(String inspectionItem);
	public List<ItemVO> delSearch2(String inspectionItem);
	
	//검사항목 확인해서 삭제하기
	public void delUpdateDD(String inspectionItem); //폐기여부 'Y' & 삭제날짜 update
	public void delBackUpData(); //데이터 삭제테이블에 백업
	public void delComplete(String inspectionItem); //본 데이터 삭제

	// 쿼리+ajax 검색기능
	public List<ItemDTO> selectSearchList(@Param("type") String type, 
			@Param("keyword") String keyword);
}
