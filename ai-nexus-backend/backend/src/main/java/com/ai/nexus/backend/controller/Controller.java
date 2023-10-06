package com.ai.nexus.backend.controller;


import com.ai.nexus.backend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;
import java.util.List;

@RestController
@RequestMapping("/tools/")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("all")
    public List<String> getAllbutons() {
        return service.getButtons();
    }
    @GetMapping("all-card")
    public Hashtable<String, String> getAllToolDescriptions() {
        Hashtable<String, String> allToolDescriptions = service.getAllToolDescriptions();
        return allToolDescriptions;
    }


}
