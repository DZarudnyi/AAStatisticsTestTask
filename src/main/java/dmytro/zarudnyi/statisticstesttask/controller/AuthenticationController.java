package dmytro.zarudnyi.statisticstesttask.controller;

import dmytro.zarudnyi.statisticstesttask.dto.user.UserLoginRequestDto;
import dmytro.zarudnyi.statisticstesttask.dto.user.UserLoginResponseDto;
import dmytro.zarudnyi.statisticstesttask.dto.user.UserRegistrationRequestDto;
import dmytro.zarudnyi.statisticstesttask.dto.user.UserRegistrationResponseDto;
import dmytro.zarudnyi.statisticstesttask.exception.RegistrationException;
import dmytro.zarudnyi.statisticstesttask.security.AuthenticationService;
import dmytro.zarudnyi.statisticstesttask.service.user.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Authorization", description = "Endpoint for registering and authentication")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    private final UserService userService;
    private final AuthenticationService authenticationService;

    @PostMapping("/registration")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Registration", description = "Register new user")
    public UserRegistrationResponseDto register(@RequestBody @Valid UserRegistrationRequestDto requestDto)
            throws RegistrationException {
        return userService.register(requestDto);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @Operation(summary = "Login", description = "Identifying user")
    public UserLoginResponseDto login(@RequestBody @Valid UserLoginRequestDto request) {
        return authenticationService.authenticate(request);
    }
}
