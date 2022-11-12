package com.example.architecture.explicit.adapter.repository;

import com.example.architecture.explicit.application.port.out.LoadUserPort;
import com.example.architecture.explicit.domain.User.UserId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@Component
@RequiredArgsConstructor
public class UserAdapter implements LoadUserPort {

	private final UserRepository userRepository;

	@Override
	public String loadUser(UserId userId) {
		UserJPAEntity user = userRepository.findById(userId.getValue())
			.orElseThrow(EntityNotFoundException::new);
		return user.getName();
	}
}
