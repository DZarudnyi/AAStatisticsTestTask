package dmytro.zarudnyi.statisticstesttask.repository;

import dmytro.zarudnyi.statisticstesttask.model.user.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, String> {
    @Query("{email: '?0'}")
    Optional<User> findUserByEmail(String email);
}
