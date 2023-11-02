package com.ai.nexus.backend.controller;

import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolDetails;
import com.ai.nexus.backend.repository.CategoryRepository;
import com.ai.nexus.backend.repository.ToolDetailsRepository;
import com.ai.nexus.backend.service.ToolDetailsService;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/tool-details")
@CrossOrigin
@Tag(name = "Tool Details Controller",description = "All api related tool")
public class ToolDetailsController {
    @Autowired
    private ToolDetailsService toolDetailsService;

    // Get list of all details

    @GetMapping("/all")

    public List<ToolDetails> getAllToolDetails() {
        return toolDetailsService.getAllToolDetails();
    }

    @GetMapping("/by-name/{name}")
    public ToolDetails getToolDetailByName(@PathVariable String name) {
        return toolDetailsService.getToolDetailsByName(name);
    }

<<<<<<< HEAD
<<<<<<< HEAD
    @GetMapping("by-id/{id}")
=======
    @GetMapping("test/{id}")
>>>>>>> 45cbfe9 (discarded tool card)
=======
    @GetMapping("by-id/{id}")
>>>>>>> 0df5dc5 (discarded tool card)
    public ToolDetails getToolDetailsById(@PathVariable Long id) {
        Optional<ToolDetails> toolDetails = toolDetailsService.getToolDetailById(id);
        if (toolDetails.isPresent()) {
            return toolDetails.get();
        } else {
            throw new RuntimeException("Tool detail with ID " + id + " not found");
        }
    }

<<<<<<< HEAD
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

<<<<<<< HEAD
=======
=======
>>>>>>> 138c711 (updated to get all card)
    @GetMapping("/byCategory/{categoryName}")
    public ResponseEntity<List<ToolDetails>> getToolDetailsByCategory(@PathVariable String categoryName) {
        List<ToolDetails> toolDetails = toolDetailsService.getToolDetailsByCategory(categoryName);
        return ResponseEntity.ok(toolDetails);
    }
    @PostMapping("/insert")
    public ToolDetails insertToolDetails(@RequestBody ToolDetails toolDetails) {
        return toolDetailsService.insertToolDetails(toolDetails);
    }

    @PatchMapping("/{toolId}")
    public ResponseEntity<ToolDetails> updateToolDetails(@PathVariable Long toolId, @RequestBody ToolDetails updatedToolDetails) {
        ToolDetails updatedTool = toolDetailsService.updateToolDetails(toolId, updatedToolDetails);
        return ResponseEntity.ok(updatedTool);
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

    @GetMapping("/byCategory/{categoryName}")
    public ResponseEntity<List<ToolDetails>> getToolDetailsByCategory(@PathVariable String categoryName) {
        List<ToolDetails> toolDetails = toolDetailsService.getToolDetailsByCategory(categoryName);
        return ResponseEntity.ok(toolDetails);
    }


    @PostMapping("/insert")
    public List<ToolDetails> createToolDetails(@RequestBody List<ToolDetails> toolDetailsList) {
        return toolDetailsService.createToolDetails(toolDetailsList);
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

>>>>>>> c9b064d (discarded tool card)
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