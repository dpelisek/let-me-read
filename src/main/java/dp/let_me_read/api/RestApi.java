package dp.let_me_read.api;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@AllArgsConstructor
@RestController
@RequestMapping("api")
@Slf4j
public class RestApi {

    @GetMapping("search")
    public List<String> search(@RequestParam(required = false) String query) {
      String lowerCaseQuery = query == null ? "" : query.toLowerCase();
        return Stream.of("Pippi", "Snow white", "Ronja")
            .filter(item -> item.toLowerCase().contains(lowerCaseQuery))
            .toList();
    }
}
