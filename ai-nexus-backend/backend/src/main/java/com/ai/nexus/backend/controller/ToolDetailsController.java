package com.ai.nexus.backend.controller;

import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolDetails;
import com.ai.nexus.backend.repository.CategoryRepository;
import com.ai.nexus.backend.repository.ToolDetailsRepository;
import com.ai.nexus.backend.service.ToolDetailsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
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
    @Operation(summary = "To get tool for \" trending \" and \"recommended\" "
            ,description = "For every API call will return a list of all unique tools no single tool will be repeated in one call"+
            "<h3> API input are: </h3> "
            + "<ul><li>To get 3 tools for trending : <b>trending</b></li>"
            + "<li>To get 3 tools for recommended : <b>recommended</b></li></ul>")
    @GetMapping("by-tag/{toolTag}")
    public List<ToolDetails> getToolByTag(@PathVariable String toolTag){
        return toolDetailsService.getToolByTag(toolTag);
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

    @GetMapping("/{categoryName}")
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