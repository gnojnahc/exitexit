package erp.exit.service;

import java.util.List;

import erp.exit.domain.ProductVO;

public interface InformationService {
	
	public void register(ProductVO vo);
	
	public List<ProductVO> list();
	
}
