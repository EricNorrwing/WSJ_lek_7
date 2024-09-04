package com.ericnorrwing.wsj_lek_7.controller;

import com.ericnorrwing.wsj_lek_7.model.User;
import com.ericnorrwing.wsj_lek_7.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findUserById (@PathVariable Long id) {

        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return ResponseEntity.ok(user);
        }

        return ResponseEntity.status(204).body(userRepository.findById(0L));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllusers () {
        return ResponseEntity
    }
}
