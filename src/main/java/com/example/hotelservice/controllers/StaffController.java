package com.example.hotelservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class StaffController {

        @GetMapping("/staffs")
        public ResponseEntity<List<String>> getStaffs(){
           List<String> list = Arrays.asList("abc","xyz","pqr","sql");
            return new ResponseEntity<>(list, HttpStatus.OK);
        }

}
