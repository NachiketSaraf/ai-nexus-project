package com.ai.nexus.backend.controller;

import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolDetails;
import com.ai.nexus.backend.repository.CategoryRepository;
import com.ai.nexus.backend.repository.ToolDetailsRepository;
import com.ai.nexus.backend.service.ToolDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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

    @GetMapping("by-id/{id}")
    public ToolDetails getToolDetailsById(@PathVariable Long id) {
        Optional<ToolDetails> toolDetails = toolDetailsService.getToolDetailById(id);
        if (toolDetails.isPresent()) {
            return toolDetails.get();
        } else {
            throw new RuntimeException("Tool detail with ID " + id + " not found");
        }
    }

    @GetMapping("/byCategory/{categoryName}")
    public ResponseEntity<List<ToolDetails>> getToolDetailsByCategory(@PathVariable String categoryName) {
        List<ToolDetails> toolDetails = toolDetailsService.getToolDetailsByCategory(categoryName);
        return ResponseEntity.ok(toolDetails);
    }


    @PostMapping("/insert")
    public List<ToolDetails> insertToolDetails(@RequestBody List<ToolDetails> toolDetailsList) {
        return toolDetailsService.insertToolDetails(toolDetailsList);
    }

    //update tool image url
    @PatchMapping("/update-tool-images")
    public ResponseEntity<List<ToolDetails>> updateToolImages(@RequestBody List<Map<String, String>> toolUpdates) {
        List<ToolDetails> updatedTools = toolDetailsService.updateToolImages(toolUpdates);
        return ResponseEntity.ok(updatedTools);
    }
    @PatchMapping("/{toolId}")
    public ResponseEntity<ToolDetails> updateToolDetails(@PathVariable Long toolId, @RequestBody ToolDetails updatedToolDetails) {
        ToolDetails updatedTool = toolDetailsService.updateToolDetails(toolId, updatedToolDetails);
        return ResponseEntity.ok(updatedTool);
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