package org.sql.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

  private final String line = "Doe, John, 1982/10/08, john.doe@foobar.com";
  private UserService userService;

  @BeforeEach
  void setup(){
    userService = new UserService();
  }


  @Test
  void should_check_user(){

  }

}
