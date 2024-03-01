package dmytro.zarudnyi.statisticstesttask.repository;

import dmytro.zarudnyi.statisticstesttask.model.user.Role;
import dmytro.zarudnyi.statisticstesttask.model.user.RoleName;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(RoleName name);
}
