package org.sql.kata;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

  private final String line = "Doe, John, 1982/10/08, john.doe@foobar.com";
  private UserService userService;

  @BeforeEach
  void setup() {
    userService = new UserService();
  }

  @Test
  void should_return_true_when_birthday_user() {
    UserDto userDto = new UserDto("Doe", "John", LocalDate.now(), "john.doe@foobar.com");
    boolean isUserBirthday = userService.checkUserBirthday(userDto);
    Assertions.assertThat(isUserBirthday).isTrue();
  }

    @Test
  void should_return_false_when_not_birthday_user() {
    UserDto userDto = new UserDto("Doe", "John", LocalDate.of(2000, 10, 12), "john.doe@foobar.com");
    boolean isUserBirthday = userService.checkUserBirthday(userDto);
    Assertions.assertThat(isUserBirthday).isFalse();
  }

}
