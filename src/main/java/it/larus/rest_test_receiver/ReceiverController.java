package it.larus.rest_test_receiver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiverController {
    @GetMapping
    public ResponseEntity<String> hello()
    {
        return ResponseEntity.ok("hello");
    }

    @PostMapping("test")
    public ResponseEntity<Payload> testJmeter(@RequestBody Payload payload){
        return new ResponseEntity(payload,HttpStatus.CREATED);
    }
}
