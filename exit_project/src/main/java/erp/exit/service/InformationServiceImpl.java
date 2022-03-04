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

}
