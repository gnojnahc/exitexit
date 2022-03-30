package erp.exit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import erp.exit.domain.InfoItemDTO;
import erp.exit.domain.InfoItemVO;
import erp.exit.domain.ProductVO;

public interface InfoItemMapper {
	
	//글등록 하기
	public void register(InfoItemVO vo);
	
	//전체 글목록 가져오기
	public List<InfoItemVO> list();
	
	//검사항목 검색해서 데이터 가져오기
	public InfoItemVO itemSearch(@Param("code") String code,@Param("inspectionItem") String inspectionItem);
	public List<InfoItemVO> InfoitemSearch2(InfoItemVO vo);
	
	// 쿼리+ajax 검색기능
	public List<InfoItemDTO> selectSearchList(@Param("type") String type, 
			@Param("keyword") String keyword);	

	//검사항목 확인해서 삭제하기
	public void delBackUpData(String infoItem); //데이터 삭제테이블에 백업
	public void delComplete(String infoItem); //본 데이터 삭제
	
	//수정
	public void modify(InfoItemVO vo);	
	
	//자재코드 자동완성
	public List<InfoItemVO> search(String code);
	
	//검사항목 자동완성
	public List<InfoItemVO> search2(@Param("code") String code,@Param("inspectionItem") String inspectionItem);

}
