package com.educandoweb.springprimario;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {

        User u1 = new User(1L, "Gabriel", "gabriel@email.com", "11999999999", "123");
        User u2 = new User(2L, "Maria", "maria@email.com", "11888888888", "456");

        List<User> list = Arrays.asList(u1, u2);

        return ResponseEntity.ok().body(list);
    }
}
