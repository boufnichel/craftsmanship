package org.sql.kata;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;

public class GreetingServiceTest {

  private List<UserDto> users = List.of(
      new UserDto("Doe", "John", LocalDate.now(), "john.doe@foobar.com"),
      new UserDto("Abdelkader", "Laaloui", LocalDate.of(2000, 10, 12), "abdel@foobar.com"),
      new UserDto("Yassir", "Aghraba", LocalDate.of(2000, 10, 12), "yassir@foobar.com")
  );

  @Test
  void should_send_greeting(){
    GreetingService greetingService = new GreetingService(new UserService(),
        new UserBirthdayNotificationService());

    List<UserDto> selectedUsers = greetingService.send(users);
    assertThat(selectedUsers).isNotNull();
    assertThat(selectedUsers).hasSize(1);
    assertThat(selectedUsers.get(0).getFirstName()).isEqualTo("John");
  }

}
