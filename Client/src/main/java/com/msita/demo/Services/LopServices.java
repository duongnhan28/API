package com.msita.demo.Services;

import com.msita.demo.client.LopClient;
import com.msita.demo.dto.Lop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LopServices {
    @Autowired
    LopClient lopClient;
    public Lop get(Integer id) {
        Lop result = lopClient.getById(id);
        return result;
    }
}
