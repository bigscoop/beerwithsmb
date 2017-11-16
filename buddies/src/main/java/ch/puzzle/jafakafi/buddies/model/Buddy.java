package ch.puzzle.jafakafi.buddies.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buddy {

    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
