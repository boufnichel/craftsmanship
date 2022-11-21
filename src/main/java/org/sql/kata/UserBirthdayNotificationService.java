package org.sql.kata;

public class UserBirthdayNotificationService {

  public GreetingsEmail sendHappyBirthdayToUser(UserDto userDto) {
    // TODO
    // prepare email config
    String subject = "Happy birthday!";
    String body = String.format("Happy birthday, dear %s!",userDto.getFirstName());
    return new GreetingsEmail(subject,body);
  }
}
