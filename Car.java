package componentScan;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public String getMileage() {
        return "my car average is 100kmpl";
    }
}
