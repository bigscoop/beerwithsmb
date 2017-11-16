package ch.puzzle.jafakafi.intentions.controller;

import ch.puzzle.jafakafi.intentions.model.Intention;
import ch.puzzle.jafakafi.intentions.repository.BuddiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/intentions")
public class IntentionRestController {

    @Autowired
    BuddiesRepository buddiesRepository;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Intention intention) {
        if (buddiesRepository.buddyExists(intention.getBuddy1()) && buddiesRepository.buddyExists(intention.getBuddy2())) {
            return ResponseEntity.status(HttpStatus.OK).body("intention created");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("intention not created");
        }
    }
}
