package co.com.bancolombia.springbootweb.controllers;

import co.com.bancolombia.springbootweb.models.User;
import co.com.bancolombia.springbootweb.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @Value("${config.code}")
    private Integer code;

    @GetMapping("/baz/{message}/{code}")
    public ParamDto baz(@PathVariable String message,
                        @PathVariable Integer code) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        paramDto.setCode(code);
        return paramDto;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        json.put("code", code);
        return json;
    }

}
