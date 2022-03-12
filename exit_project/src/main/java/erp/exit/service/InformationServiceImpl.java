package erp.exit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import erp.exit.domain.ProductVO;
import erp.exit.mapper.InformationMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class InformationServiceImpl implements InformationService {
	
	private InformationMapper mapper;

	@Override
	public void register(ProductVO vo) {
		mapper.register(vo);
	}

	@Override
	public List<ProductVO> list() {
		return mapper.list();
	}

	@Override
	public ProductVO delCodeSearch(String code) {
		return mapper.delCodeSearch(code);
	}
	@Override
	public List<ProductVO> delCodeSearch2(String code) {
		return mapper.delCodeSearch2(code);
	}

	@Override
	public void delCodeComplete(String code) {
		mapper.delCodeComplete(code);
	}


}
