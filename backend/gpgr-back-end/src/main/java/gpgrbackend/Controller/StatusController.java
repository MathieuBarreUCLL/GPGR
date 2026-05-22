package gpgrbackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")

public class StatusController {

    @GetMapping("/check")
    public String checkStatus() {
        return "Server is running!";
    }
}
