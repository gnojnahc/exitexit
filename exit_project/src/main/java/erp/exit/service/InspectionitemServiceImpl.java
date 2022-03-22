package erp.exit.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Service;

import erp.exit.domain.ItemDTO;
import erp.exit.domain.ItemVO;
import erp.exit.mapper.InspectionitemMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class InspectionitemServiceImpl implements InspectionitemService {
	
	InspectionitemMapper mapper;
	
	@Override
	public void register(ItemVO vo) {
		mapper.register(vo);
	}

	@Override
	public List<ItemVO> list() {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		List<ItemVO> list = mapper.list();
		for (ItemVO data : list) {
			data.setDf_creationDate(df.format(data.getCreationDate()));
			data.setDf_modifiedDate(df.format(data.getModifiedDate()));
			data.setDf_delDate(df.format(data.getDelDate()));
		}
		
		return list;
	}

	@Override
	public List<ItemDTO> selectSearchList(String type, String keyword) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		List<ItemDTO> list = mapper.selectSearchList(type, keyword);
		for (ItemDTO data : list) {
			data.setDf_creationDate(df.format(data.getCreationDate()));
			data.setDf_modifiedDate(df.format(data.getModifiedDate()));
			data.setDf_delDate(df.format(data.getDelDate()));
		}
		
		return list;
	}

	@Override
	public ItemVO delSearch(String inspectionItem) {
		return mapper.delSearch(inspectionItem);
	}

	@Override
	public List<ItemVO> delSearch2(String inspectionItem) {
		return mapper.delSearch2(inspectionItem);
	}

	// 삭제&백업 서비스
	@Override
	public void delUpdateDD(String inspectionItem) {
		mapper.delUpdateDD(inspectionItem);
	}
	
	@Override
	public void delBackUpData(String inspectionItem) {
		mapper.delBackUpData(inspectionItem);
	}
	
	@Override
	public void delComplete(String inspectionItem) {
		mapper.delComplete(inspectionItem);
	}
	// 삭제&백업 서비스 끝


}
