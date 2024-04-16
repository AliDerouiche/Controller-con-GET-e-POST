package com.example.demo4;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/obtain")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverse")
    public String postName(@RequestParam String name) {
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return sb.toString();
    }
}
