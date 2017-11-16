package ch.puzzle.jafakafi.intentions.repository;

import ch.puzzle.jafakafi.intentions.integration.BuddyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
public class BuddiesRepository {


    @Autowired
    private BuddyClient buddyClient;

    public boolean buddyExists(String name) {
        return HttpStatus.NO_CONTENT.equals(buddyClient.buddyExists(name).getStatusCode());
    }

}
