package ch.puzzle.jafakafi.intentions.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "buddies", url = "http://localhost:8080", decode404 = true)
public interface BuddyClient {

    @RequestMapping(method = RequestMethod.HEAD, value = "/buddies/{name}")
    ResponseEntity buddyExists(@PathVariable("name") String name);


}
