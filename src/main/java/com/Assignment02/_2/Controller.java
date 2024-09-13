package com.Assignment02._2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @GetMapping("/phrase")
    public Buzzword getBuzzword() {
            String url = "https://corporatebs-generator.sameerkumar.website/";
            RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, Buzzword.class);
        }
    }

