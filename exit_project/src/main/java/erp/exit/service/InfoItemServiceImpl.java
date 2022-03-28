package erp.exit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import erp.exit.domain.InfoItemDTO;
import erp.exit.domain.InfoItemVO;
import erp.exit.mapper.InfoItemMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class InfoItemServiceImpl implements InfoItemService{

	InfoItemMapper mapper;
	
	//등록
	@Override
	public void register(InfoItemVO vo) {
		mapper.register(vo);
	}
	
	//목록
	@Override
	public List<InfoItemVO> list() {
		return mapper.list();
	}
	
	//검색
	@Override
	public InfoItemVO codeSearch(String code) {
		return mapper.InfoitemSearch(code);
	}
	
	//검색
	@Override
	public List<InfoItemVO> codeSearch2(String code) {
		return mapper.InfoitemSearch2(code);
	}

	@Override
	public List<InfoItemDTO> selectSearchList(String type, String keyword) {
		return mapper.selectSearchList(type, keyword);
	}

	@Override
	public void delBackUpData(String infoItem) {
		mapper.delBackUpData(infoItem);
	}

	@Override
	public void delComplete(String infoItem) {
		mapper.delComplete(infoItem);
	}

	@Override
	public void modify(InfoItemVO vo) {
		mapper.modify(vo);
	}
	
	
}
