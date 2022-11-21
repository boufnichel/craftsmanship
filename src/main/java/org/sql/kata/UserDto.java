package org.sql.kata;

import java.time.LocalDate;

public class UserDto {


  private String lastName;
  private final String firstName;
  private final LocalDate dob;
  private final String email;

  public UserDto(String lastName, String firstName, LocalDate dob, String email) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.dob = dob;
    this.email = email;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public LocalDate getDob() {
    return dob;
  }

  public String getEmail() {
    return email;
  }
}
