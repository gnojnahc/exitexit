package erp.exit.service;

import erp.exit.domain.MemberVO;

public interface StartService {
	
	//로그인
	public Integer login(String userId, String userPass);
	
	//회원가입
	public void create(MemberVO vo);
	
}
