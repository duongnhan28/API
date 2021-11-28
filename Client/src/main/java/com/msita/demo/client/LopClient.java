package com.msita.demo.client;

import com.msita.demo.dto.Lop;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class LopClient {

    public List<Lop> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Lop> entity = new HttpEntity<Lop>(headers);
        ResponseEntity<List<Lop>> response = restTemplate.exchange("http://localhost:8080/lop",
                HttpMethod.GET,entity, new ParameterizedTypeReference<List<Lop>>() {});
        return response.getBody();
    }

    public void save(Lop lop) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/lop/add";
        HttpEntity<Lop> request = new HttpEntity<>(lop);
        restTemplate.postForEntity(fooResourceUrl, request, Lop.class);
    }

    public Lop getById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8080/lop";
        ResponseEntity<Lop> response = restTemplate.getForEntity(fooResourceUrl + "/" + id, Lop.class);
        return response.getBody();
    }

    public void deleteById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/lop/delete";
        String entityUrl = fooResourceUrl + "/" + id;
        restTemplate.delete(entityUrl);
    }

}
