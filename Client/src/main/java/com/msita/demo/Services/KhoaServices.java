package com.msita.demo.Services;

import com.msita.demo.client.KhoaClient;
import com.msita.demo.dto.Khoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhoaServices {
    @Autowired
    private KhoaClient khoaClient;

    public Khoa get(Integer maKhoa) {
//        Department result = departmentClient.findById(id);
        Khoa result = khoaClient.getById(maKhoa);
        return result;
    }
}
