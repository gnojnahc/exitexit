package erp.exit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import erp.exit.domain.MemberVO;
import erp.exit.domain.ProductDTO;
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

	// 쿼리+ajax 검색기능
	public List<ProductDTO> selectSearchList(@Param("type") String type, 
			@Param("keyword") String keyword);
	
	//로그인 하기
	public Integer login(@Param("userId") String userId, 
			@Param("userPass") String userPass);
	
	//회원가입 하기
	public void create(MemberVO vo);
	
}
