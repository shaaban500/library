package com.example.library.controllers;

import com.example.library.services.AuthorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/employees")
public class AuthorsController {

    private AuthorsService authorsService;

    @GetMapping("/filter-by-ids")
    public ResponseEntity<String> getEmployeesByIds() {
        return ResponseEntity.ok("gggggggggggggggggg");
    }
}
