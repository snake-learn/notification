package com.snake.notification.controllers.impl;

import com.snake.common.dtos.wrappers.AppResponse;
import com.snake.notification.controllers.AuthApi;
import com.snake.notification.controllers.dtos.requests.LoginRequest;
import com.snake.notification.controllers.dtos.responses.LoginResponse;
import com.snake.notification.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController implements AuthApi {

    private final AuthService authService;

    @Override
    public AppResponse<LoginResponse> login(LoginRequest request) {
        return AppResponse.ok(authService.login(request));
    }
}
