package com.msita.demo.client;


import com.msita.demo.dto.Khoa;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KhoaClient {
    public Khoa getById(Integer id){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl  = "http://localhost:8080/khoa";
        ResponseEntity<Khoa> response
                = restTemplate.getForEntity(fooResourceUrl + "/"+id, Khoa.class);

        return response.getBody();
    }

    public List<Khoa> getAll(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Khoa> entity = new HttpEntity<Khoa>(headers);
        ResponseEntity<List<Khoa>> response = restTemplate.exchange("http://localhost:8080/khoa",
                HttpMethod.GET,entity, new ParameterizedTypeReference<List<Khoa>>() {});
        return response.getBody();
    }
    public Khoa findAll(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Khoa> response =restTemplate.getForEntity(
                "http://localhost:8080/khoa",
                Khoa.class);
        return response.getBody();
    }
    public void deleteById (Integer id){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl  = "http://localhost:8080/khoa/delete";
        String entityUrl = fooResourceUrl + "/" + id;
        restTemplate.delete(entityUrl);
    }
    public void create(Khoa khoa){
        RestTemplate restTemplate  = new RestTemplate();
        String fooResourceUrl  = "http://localhost:8080/khoa/add";
        HttpEntity<Khoa> request = new HttpEntity<>(khoa);
        restTemplate.postForEntity(fooResourceUrl,request,Khoa.class);
    }
    }
