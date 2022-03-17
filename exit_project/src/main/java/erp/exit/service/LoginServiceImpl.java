package erp.exit.service;

import org.springframework.stereotype.Service;

import erp.exit.mapper.InformationMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {
	
	private InformationMapper mapper;
	
	@Override
	public Integer login(String userId, String userPass ) {
		int cnt = mapper.login(userId, userPass);
		
		return cnt;
	}
}
