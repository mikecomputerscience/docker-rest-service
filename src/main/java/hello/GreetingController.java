package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello000000000000, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(), String.format(template, "World"));
    }

    @RequestMapping("/greeting/{name}")
    public Greeting greeting(@PathVariable("name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


}
