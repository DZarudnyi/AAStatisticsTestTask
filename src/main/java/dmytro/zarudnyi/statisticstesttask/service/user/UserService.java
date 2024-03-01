package dmytro.zarudnyi.statisticstesttask.service.user;

import dmytro.zarudnyi.statisticstesttask.dto.user.UserRegistrationRequestDto;
import dmytro.zarudnyi.statisticstesttask.dto.user.UserRegistrationResponseDto;
import dmytro.zarudnyi.statisticstesttask.exception.RegistrationException;

public interface UserService {
    UserRegistrationResponseDto register(UserRegistrationRequestDto requestDto) throws RegistrationException;
}
