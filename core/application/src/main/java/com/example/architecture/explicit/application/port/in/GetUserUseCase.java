package com.example.architecture.explicit.application.port.in;

import com.example.architecture.explicit.domain.User;

public interface GetUserUseCase {

	String getName(User.UserId userId);
}
