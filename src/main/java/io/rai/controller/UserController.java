package io.rai.controller;

import io.rai.entity.User;
import io.rai.model.UserDraft;
import io.rai.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rai on 16/12/26.
 */
@RestController
public class UserController {
  @Autowired
  private UserService userService;

  @ApiOperation("crate user")
  @PostMapping("/users")
  public User createUser(@RequestBody
                         @ApiParam(value = "user draft", required = true)
                             UserDraft draft) {
    return userService.createUser(draft);
  }

  @ApiOperation("get user by id")
  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable("id")
                          @ApiParam(value = "user id", required = true)
                              Integer id) {
    return userService.getUserById(id);
  }

  @ApiOperation("get all users")
  @GetMapping("/users")
  public List<User> getAllUser() {
    return userService.getAllUsers();
  }
}
