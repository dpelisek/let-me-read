package dp.let_me_read.api;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api")
@Slf4j
public class RestApi {

    @GetMapping("search")
    public List<String> search(@RequestParam String query) {
        return List.of("Pippi", "Snow white", "Ronja");
    }
}
