package com.example.architecture.explicit.application.port.out;

import com.example.architecture.explicit.domain.User.UserId;

public interface LoadUserPort {
	String loadUser(UserId userId);
}
