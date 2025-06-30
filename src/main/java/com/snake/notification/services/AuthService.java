package com.snake.notification.services;

import com.snake.notification.controllers.dtos.requests.LoginRequest;
import com.snake.notification.controllers.dtos.responses.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}
