package org.sql.kata;

import org.junit.jupiter.api.Test;

public class NotificationServiceTest {

  UserService userService;
  String firstName;
  String expected = "Subject: Happy birthday!\n" +
      "\n" +
      "Happy birthday, dear " + firstName + "!";

  @Test
  void notification_should_be_sent() {

  }

}