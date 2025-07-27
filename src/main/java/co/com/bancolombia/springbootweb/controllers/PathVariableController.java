package co.com.bancolombia.springbootweb.controllers;

import co.com.bancolombia.springbootweb.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}/{code}")
    public ParamDto baz(@PathVariable String message,
                        @PathVariable Integer code) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        paramDto.setCode(code);
        return paramDto;
    }
}
