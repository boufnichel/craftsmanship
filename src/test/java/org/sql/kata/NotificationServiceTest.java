package org.sql.kata;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotificationServiceTest {




  @Test
  void notification_should_be_sent_when_its_user_birthday() {
      UserBirthdayNotificationService userBirthdayNotificationService = new UserBirthdayNotificationService();
    GreetingsEmail messageBody = userBirthdayNotificationService.sendHappyBirthdayToUser(new UserDto("Doe", "John", LocalDate.now(), "john.doe@foobar.com"));
    Assertions.assertThat(messageBody.getSubject()).isEqualTo("Happy birthday!");
    Assertions.assertThat(messageBody.getBody()).isEqualTo("Happy birthday, dear John!");
  }

}