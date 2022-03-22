package erp.exit.service;

import java.util.List;

import erp.exit.domain.ItemDTO;
import erp.exit.domain.ItemVO;

public interface InspectionitemService {
	
	public void register(ItemVO vo);
	
	public List<ItemVO> list();

	public ItemVO delSearch(String inspectionItem);
	public List<ItemVO> delSearch2(String inspectionItem);
	
	public void delUpdateDD(String inspectionItem); //폐기여부 'Y' & 삭제날짜 update
	public void delBackUpData(String inspectionItem); //데이터 삭제테이블에 백업
	public void delComplete(String inspectionItem); //본 데이터 삭제
	
	public List<ItemDTO> selectSearchList(String type, String keyword);
	
}
