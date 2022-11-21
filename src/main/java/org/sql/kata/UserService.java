package org.sql.kata;

import java.time.LocalDate;

public class UserService {

    public boolean checkUserBirthday(UserDto userDto) {
        LocalDate now = LocalDate.now();
        return   userDto.getDob().getMonth().equals(now.getMonth()) &&
                userDto.getDob().getDayOfMonth() == now.getDayOfMonth();
    }
}
