package br.com.backend.course.entites.resources;

import br.com.backend.course.entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findALL(){
        User u = new User(1, "maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }

}
