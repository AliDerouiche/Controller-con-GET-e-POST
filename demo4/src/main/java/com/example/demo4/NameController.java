package com.example.demo4;
import io.swagger.v3.oas.annotations.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/obtain")
    @Operation(summary = ("get the written name"))
    public String getName(@Parameter(description = "insert the name to print")@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverse")
    @Operation(summary = ("revert written name"))
    public String postName(@Parameter(description = "insert the name to revert")@RequestParam String name) {
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return sb.toString();
    }
}

