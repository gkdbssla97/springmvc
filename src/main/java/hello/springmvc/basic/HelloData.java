package hello.springmvc.basic;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

@Data
public class HelloData {

    private String username;
    private int age;

}
