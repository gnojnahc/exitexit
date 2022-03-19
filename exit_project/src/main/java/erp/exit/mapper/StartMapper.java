package erp.exit.mapper;

import org.apache.ibatis.annotations.Param;

import erp.exit.domain.MemberVO;

public interface StartMapper {
	
	//로그인 하기
	public Integer login(@Param("userId") String userId, 
			@Param("userPass") String userPass);
	
	//회원가입 하기
	public void create(MemberVO vo);
}
