package erp.exit.service;

import org.springframework.stereotype.Service;

import erp.exit.domain.MemberVO;
import erp.exit.mapper.InformationMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {
	
	private InformationMapper mapper;
	
	@Override
	public void create(MemberVO vo) {
		mapper.create(vo);
	}
}
