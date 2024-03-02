package dmytro.zarudnyi.statisticstesttask.service.user;

import dmytro.zarudnyi.statisticstesttask.config.SecurityConfig;
import dmytro.zarudnyi.statisticstesttask.dto.user.UserRegistrationRequestDto;
import dmytro.zarudnyi.statisticstesttask.dto.user.UserRegistrationResponseDto;
import dmytro.zarudnyi.statisticstesttask.exception.RegistrationException;
import dmytro.zarudnyi.statisticstesttask.mapper.UserMapper;
import dmytro.zarudnyi.statisticstesttask.model.user.User;
import dmytro.zarudnyi.statisticstesttask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final SecurityConfig config;

    @Override
    public UserRegistrationResponseDto register(UserRegistrationRequestDto requestDto)
            throws RegistrationException {
        if (userRepository.findUserByEmail(requestDto.getEmail()).isPresent()) {
            throw new RegistrationException("User already exists!");
        }
        User user = new User();
        user.setEmail(requestDto.getEmail());
        user.setPassword(config.getPasswordEncoder().encode(requestDto.getPassword()));
        user.setFirstName(requestDto.getFirstName());
        user.setLastName(requestDto.getLastName());
        User savedUser = userRepository.save(user);
        return userMapper.toRegistrationResponse(savedUser);
    }
}
