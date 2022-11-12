package com.example.architecture.explicit.adapter.web;

import com.example.architecture.explicit.application.port.in.GetUserUseCase;
import com.example.architecture.explicit.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {


	private final GetUserUseCase getUserUseCase;

	@GetMapping("/world/{userId::\\d+}")
	public String helloWorld(@PathVariable("userId") Integer userId) {
		return getUserUseCase.getName(new User.UserId(userId));
	}
}
