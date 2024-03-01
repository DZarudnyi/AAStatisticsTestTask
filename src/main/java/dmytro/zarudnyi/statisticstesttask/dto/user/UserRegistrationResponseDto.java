package dmytro.zarudnyi.statisticstesttask.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRegistrationResponseDto(
        @NotBlank
        Long id,
        @Email
        @NotBlank
        String email,
        @NotBlank
        String firstName,
        @NotBlank
        String lastName
) {
}
