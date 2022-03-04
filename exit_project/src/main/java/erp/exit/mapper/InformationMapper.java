package erp.exit.mapper;

import java.util.List;

import erp.exit.domain.ProductVO;

public interface InformationMapper {
	
	public void register(ProductVO vo);
	
	public List<ProductVO> list();
	
}
