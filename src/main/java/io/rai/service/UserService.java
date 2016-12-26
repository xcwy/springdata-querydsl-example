package io.rai.service;

import io.rai.entity.User;
import io.rai.model.UserDraft;
import io.rai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rai on 16/12/26.
 */
@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public User createUser(UserDraft draft) {
    User user = new User();
    user.setName(draft.getName());
    user.setAge(draft.getAge());

    User savedUser = userRepository.save(user);

    return savedUser;
  }

  public User getUserById(int id) {
    return userRepository.findOne(id);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
