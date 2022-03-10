package erp.exit.mapper;

import java.util.List;

import erp.exit.domain.ProductVO;

public interface InformationMapper {
	
	//글등록 하기
	public void register(ProductVO vo);
	
	//전체 글목록 가져오기
	public List<ProductVO> list();
	
}
