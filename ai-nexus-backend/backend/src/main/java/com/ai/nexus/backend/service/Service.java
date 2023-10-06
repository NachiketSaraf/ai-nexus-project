package com.ai.nexus.backend.service;


import com.ai.nexus.backend.utils.SimpleCardUtils;
import org.springframework.stereotype.Component;
import com.ai.nexus.backend.utils.CategoryButtonUtils;

import java.util.Hashtable;
import java.util.List;

@Component
public class Service {

    public List<String> getButtons() {
        return CategoryButtonUtils.getButton();
    }
    public Hashtable<String, String> getAllToolDescriptions() {
        return SimpleCardUtils.getAllCardDis();
    }


}
