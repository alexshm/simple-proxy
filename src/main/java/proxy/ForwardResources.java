package proxy;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by ashmaltsuev on 27/07/17.
 */

@RestController
public class ForwardResources {

    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    public int sumXandY(@RequestBody Map<String, Integer> json) throws Exception {
        final String uri = "http://localhost:5000/sum";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, json, Integer.class);
    }

}
