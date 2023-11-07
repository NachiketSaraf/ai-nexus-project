package com.ai.nexus.backend.controller;

import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolDetails;
import com.ai.nexus.backend.repository.CategoryRepository;
import com.ai.nexus.backend.repository.ToolDetailsRepository;
import com.ai.nexus.backend.service.ToolDetailsService;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 0aba792 (New api to get tools with trending and recommended)
<<<<<<< HEAD
import io.swagger.v3.oas.annotations.Operation;
=======
>>>>>>> 144ac6a (added swagger)
<<<<<<< HEAD
>>>>>>> 6f18d2b (added swagger)
=======
=======
import io.swagger.v3.oas.annotations.Operation;
>>>>>>> fc8f031 (New api to get tools with trending and recommended)
>>>>>>> 0aba792 (New api to get tools with trending and recommended)
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import io.swagger.v3.oas.annotations.Operation;
=======
>>>>>>> 144ac6a (added swagger)
=======
import io.swagger.v3.oas.annotations.Operation;
>>>>>>> fc8f031 (New api to get tools with trending and recommended)
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
=======
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
>>>>>>> c9b064d (discarded tool card)
<<<<<<< HEAD
=======
=======
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
>>>>>>> 9ea63d0f61b01d9abd32d4a5a9355b40197e96da
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
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

<<<<<<< HEAD
    @GetMapping("/all")

=======
    @GetMapping("/All")
>>>>>>> 46abb0a (updated to get all card)
    public List<ToolDetails> getAllToolDetails() {
        return toolDetailsService.getAllToolDetails();
    }

    @GetMapping("/by-name/{name}")
    public ToolDetails getToolDetailByName(@PathVariable String name) {
        return toolDetailsService.getToolDetailsByName(name);
    }
<<<<<<< HEAD

<<<<<<< HEAD
<<<<<<< HEAD
=======
    @Operation(summary = "To get tool for \" trending \" and \"recommended\" "
            ,description = "For every API call will return a list of all unique tools no single tool will be repeated in one call"+
            "<h3> API input are: </h3> "
            + "<ul><li>To get 3 tools for trending : <b>trending</b></li>"
            + "<li>To get 3 tools for recommended : <b>recommended</b></li></ul>")
    @GetMapping("by-tag/{toolTag}")
    public List<ToolDetails> getToolByTag(@PathVariable String toolTag){
        return toolDetailsService.getToolByTag(toolTag);
    }
>>>>>>> 0aba792 (New api to get tools with trending and recommended)
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
<<<<<<< HEAD
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
=======
=======
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
    @GetMapping("/{categoryName}")
>>>>>>> 46abb0a (updated to get all card)
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
    @GetMapping("/byCategory/{categoryName}")
=======
=======
<<<<<<< HEAD
>>>>>>> 39281af7f2aad36404aeb5eb48de6a6c10bdefbb
    @GetMapping("/byCategory/{categoryName}")
=======
    @GetMapping("/{categoryName}")
>>>>>>> 9ea63d0f61b01d9abd32d4a5a9355b40197e96da
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
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

<<<<<<< HEAD
>>>>>>> c9b064d (discarded tool card)
=======
<<<<<<< HEAD
>>>>>>> c9b064d (discarded tool card)
=======
>>>>>>> 9ea63d0f61b01d9abd32d4a5a9355b40197e96da
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
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