package com.ai.nexus.backend.controller;


import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolCard;
import com.ai.nexus.backend.service.ToolCardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tools")
@CrossOrigin
public class ToolCardController {
    @Autowired
    private ToolCardService toolCardService;

    @GetMapping("/all-tool")
    public List<ToolCard> getAllToolName(){
        return toolCardService.getAllToolName();
    }

    @GetMapping("/byCategory/{categoryId}")
    public List<ToolCard> getToolsByCategoryId(@PathVariable int categoryId) {
        Category category = new Category();
        category.setCategoryId(categoryId);
        return toolCardService.getToolsByCategoryId(category);
    }

    @GetMapping("/toolNamesByCategory/{categoryName}")
    public ResponseEntity<List<String>> getToolNamesByCategoryName(@PathVariable String categoryName) {
        List<String> toolNames = toolCardService.getToolNamesByCategoryName(categoryName);

        if (toolNames.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(toolNames);
    }


    @GetMapping("/nameAndDescription/{categoryName}")
    public ResponseEntity<List<Map<String, String>>> getToolNamesAndDescriptionsByCategoryName(@PathVariable String categoryName) {
        List<Object[]> results = toolCardService.getToolNamesAndDescriptionsByCategoryName(categoryName);

        if (results.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        List<Map<String, String>> toolInfoList = new ArrayList<>();
        for (Object[] result : results) {
            Map<String, String> toolInfo = new HashMap<>();
            toolInfo.put("toolName", (String) result[0]);
            toolInfo.put("description", (String) result[1]);
            toolInfoList.add(toolInfo);
        }

        return ResponseEntity.ok(toolInfoList);
    }

    @GetMapping("/byname/{name}")
    public ResponseEntity<ToolCard> getToolCardsByToolName(@PathVariable String name) {
        ToolCard toolCards = toolCardService.getToolCardsByToolName(name);
        return ResponseEntity.ok(toolCards);


    }
}
//    @GetMapping("/toolNamesByCategory/{categoryName}")
//    public ResponseEntity<List<String>> getToolNamesByCategoryName(@PathVariable String categoryName) {
//        List<String> toolNames = toolCardService.getToolNamesByCategoryName(categoryName);
//
//        if (toolNames.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        return ResponseEntity.ok(toolNames);
//    }


//    @GetMapping("/byCategory/{category}")
//    public List<ToolCard> getToolsByCategory(@PathVariable String category) {
//        return service.getToolsByCategory(category);
//    }


//    @GetMapping("all")
//    public List<String> getAllbutons() {
//        return service.getButtons();
//    }
//    @GetMapping("all-card")
//    public Hashtable<String, String> getAllToolDescriptions() {
//        Hashtable<String, String> allToolDescriptions = service.getAllToolDescriptions();
//        return allToolDescriptions;
//    }



