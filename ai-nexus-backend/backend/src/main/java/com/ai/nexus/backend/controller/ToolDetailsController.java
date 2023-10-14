package com.ai.nexus.backend.controller;

import com.ai.nexus.backend.model.ToolDetails;
import com.ai.nexus.backend.service.ToolDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ToolDetails")
@CrossOrigin
public class ToolDetailsController {
    @Autowired
    private ToolDetailsService toolDetailsService;


    @GetMapping("/all")
    public List<ToolDetails> getAllToolDetails() {
        return toolDetailsService.getAllToolDetails();
    }

    @GetMapping("/by-name/{name}")
    public ToolDetails getToolDetailByName(@PathVariable String name) {
        return toolDetailsService.getToolDetailsByName(name);
    }

    @GetMapping("test/{id}")
    public ToolDetails getToolDetailsById(@PathVariable Long id) {
        Optional<ToolDetails> toolDetails = toolDetailsService.getToolDetailById(id);
        if (toolDetails.isPresent()) {
            return toolDetails.get();
        } else {
            throw new RuntimeException("Tool detail with ID " + id + " not found");
        }
    }

//    @PostMapping
//    public ToolDetails createToolDetails(@RequestBody ToolDetails toolDetails) {
//        return toolDetailsService.createToolDetail(toolDetails);
//    }
//
//    @PutMapping("/{id}")
//    public ToolDetails updateToolDetails(@PathVariable Long id, @RequestBody ToolDetails updatedToolDetails) {
//        return toolDetailsService.updateToolDetail(id, updatedToolDetails);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteToolDetails(@PathVariable Long id) {
//        toolDetailsService.deleteToolDetail(id);
//    }

}
