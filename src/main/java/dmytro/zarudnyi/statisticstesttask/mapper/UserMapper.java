package dmytro.zarudnyi.statisticstesttask.mapper;

import dmytro.zarudnyi.statisticstesttask.config.MapperConfig;
import dmytro.zarudnyi.statisticstesttask.dto.user.UserRegistrationResponseDto;
import dmytro.zarudnyi.statisticstesttask.model.user.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class, componentModel = "spring")
public interface UserMapper {
    UserRegistrationResponseDto toRegistrationResponse(User user);
}
