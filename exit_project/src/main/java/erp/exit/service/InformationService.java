package erp.exit.service;

import java.util.List;

import erp.exit.domain.ProductVO;

public interface InformationService {
	
	public void register(ProductVO vo);
	
	public List<ProductVO> list();

	public ProductVO delCodeSearch(String code);
	public List<ProductVO> delCodeSearch2(String code);
	
	public void delCodeComplete(String code);
	
}
