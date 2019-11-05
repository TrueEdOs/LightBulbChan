package org.light.bulb.chan.lbcbot;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class TestService {
    public TestService() {
        System.out.println("A");
    }

    @Scheduled(fixedRate=100)
    private void doSomething() {
        System.out.println("OK");
    }
}
