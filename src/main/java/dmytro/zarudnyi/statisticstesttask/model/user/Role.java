package dmytro.zarudnyi.statisticstesttask.model.user;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    private String id;
    @NotBlank
    @Enumerated(value = EnumType.STRING)
    @Indexed(unique = true)
    private RoleName name;
}
