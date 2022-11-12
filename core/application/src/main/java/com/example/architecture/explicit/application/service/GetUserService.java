package com.example.architecture.explicit.application.service;

import com.example.architecture.explicit.application.port.in.GetUserUseCase;
import com.example.architecture.explicit.application.port.out.LoadUserPort;
import com.example.architecture.explicit.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserService implements GetUserUseCase {

	private final LoadUserPort loadUserPort;

	@Override
	public String getName(User.UserId userId) {
		return loadUserPort.loadUser(userId);
	}
}
