package com.example.second;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@RestController
public class TimeController {

    @GetMapping("/time")
    public String time(HttpServletRequest request) {
        return Instant.now().toString();
    }
}
