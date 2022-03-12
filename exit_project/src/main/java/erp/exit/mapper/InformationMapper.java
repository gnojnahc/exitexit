package erp.exit.mapper;

import java.util.List;

import erp.exit.domain.ProductVO;

public interface InformationMapper {
	
	//글등록 하기
	public void register(ProductVO vo);
	
	//전체 글목록 가져오기
	public List<ProductVO> list();
	
	//삭제코드 검색해서 데이터 가져오기
	public ProductVO delCodeSearch(String code);
	public List<ProductVO> delCodeSearch2(String code);
	
	//코드 확인해서 삭제하기
	public void delCodeComplete(String code);
	
}
