package io.rai.repository;

import io.rai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rai on 16/12/26.
 */
public interface UserRepository extends JpaRepository<User, Integer>{
}
