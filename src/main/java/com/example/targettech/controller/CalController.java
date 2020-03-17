package com.example.targettech.controller;

import com.example.targettech.model.CalRequest;
import com.example.targettech.services.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CalController {

    @Autowired
    private CalService calService;

    @PostMapping("/api/calculate")
    public ResponseEntity<?> calculate(@Valid @RequestBody CalRequest calRequest) {
        double resultFromService = calService.calculate(calRequest);
        return ResponseEntity.ok(resultFromService);
    }

}
