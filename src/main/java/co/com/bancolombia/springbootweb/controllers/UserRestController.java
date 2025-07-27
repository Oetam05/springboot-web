package co.com.bancolombia.springbootweb.controllers;

import co.com.bancolombia.springbootweb.models.User;
import co.com.bancolombia.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        userDto.setTitle("User Details");
        userDto.setUser(new User("John", "Doe"));
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user1 = new User("John", "Doe");
        User user2 = new User("Jane", "Doe");
        return List.of(user1, user2);
    }

}
