package dmytro.zarudnyi.statisticstesttask.dto.user;

public record UserRegistrationResponseDto(
        String id,
        String email,
        String firstName,
        String lastName
) {
}
