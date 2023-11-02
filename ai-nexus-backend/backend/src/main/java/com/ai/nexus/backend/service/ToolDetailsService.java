package com.ai.nexus.backend.service;


import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolDetails;
import com.ai.nexus.backend.repository.CategoryRepository;
import com.ai.nexus.backend.repository.ToolDetailsRepository;
import jakarta.transaction.Transactional;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
=======
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
>>>>>>> 758d6d9 (discarded tool card)
=======
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
>>>>>>> e8fed01 (New api to get tools with trending and recommended)

@Service
public class ToolDetailsService {
    @Autowired
    private  ToolDetailsRepository toolDetailsRepository;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 57b28d6 (discarded tool card)
=======
    @Autowired
    private CategoryRepository categoryRepository;
    @Transactional
    public List<ToolDetails> createToolDetails(List<ToolDetails> toolDetailsList) {
        List<ToolDetails> savedToolDetails = new ArrayList<>();

        for (ToolDetails toolDetails : toolDetailsList) {
            String categoryName = toolDetails.getCategory().getCategoryName();

            // Check if the category with the specified name exists in the database
            Category category = categoryRepository.findByCategoryName(categoryName);

            // If the category doesn't exist, create a new one
            if (category == null) {
                category = new Category();
                category.setCategoryName(categoryName);
                categoryRepository.save(category);
            }

            toolDetails.setCategory(category);
            savedToolDetails.add(toolDetailsRepository.save(toolDetails));
        }

        return savedToolDetails;
    }
<<<<<<< HEAD
<<<<<<< HEAD
    public List<ToolDetails> updateToolImages(List<Map<String, String>> toolUpdates) {
        List<ToolDetails> updatedTools = new ArrayList<>();

=======

    public String updateToolImages(List<Map<String, String>> toolUpdates) {
>>>>>>> 57b28d6 (discarded tool card)
=======
    public List<ToolDetails> updateToolImages(List<Map<String, String>> toolUpdates) {
        List<ToolDetails> updatedTools = new ArrayList<>();

>>>>>>> b897d30 (discarded tool card)
        for (Map<String, String> toolUpdate : toolUpdates) {
            String toolName = toolUpdate.get("toolName");
            String toolImage = toolUpdate.get("toolImage");

            if (toolName != null && toolImage != null) {
                ToolDetails tool = toolDetailsRepository.findByToolName(toolName);
                if (tool != null) {
                    tool.setToolImage(toolImage);
<<<<<<< HEAD
<<<<<<< HEAD
                    updatedTools.add(toolDetailsRepository.save(tool));
                }
            }
        }

        return updatedTools;
    }

>>>>>>> 758d6d9 (discarded tool card)
=======
>>>>>>> a1205b5 (discarded tool card)
=======
                    toolDetailsRepository.save(tool);
                } else {
                    return "Tool with name '" + toolName + "' not found.";
=======
                    updatedTools.add(toolDetailsRepository.save(tool));
>>>>>>> b897d30 (discarded tool card)
                }
            }
        }

        return updatedTools;
    }

>>>>>>> c9b064d (discarded tool card)
>>>>>>> 57b28d6 (discarded tool card)
=======
>>>>>>> 8128aaf (discarded tool card)

    public List<ToolDetails> getAllToolDetails() {
        return toolDetailsRepository.findAll();
    }
    public List<ToolDetails> getToolDetailsByCategory(String categoryName) {
        return toolDetailsRepository.findByCategory_CategoryName(categoryName);
    }
    public ToolDetails getToolDetailsByName(String name) {
        return toolDetailsRepository.findByToolName(name);
    }

    public Optional<ToolDetails> getToolDetailById(Long id) {
        return toolDetailsRepository.findById(id);
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
        // Update all fields
        existingTool.setToolName(updatedToolDetails.getToolName());
        existingTool.setToolImage(updatedToolDetails.getToolImage());
        existingTool.setToolFeatures(updatedToolDetails.getToolFeatures());
        existingTool.setToolWebsiteLink(updatedToolDetails.getToolWebsiteLink());
        existingTool.setToolDemoVideoLinks(updatedToolDetails.getToolDemoVideoLinks());
        existingTool.setCategory(updatedToolDetails.getCategory());
        existingTool.setToolDescription(updatedToolDetails.getToolDescription());

        return toolDetailsRepository.save(existingTool);
    }

    public List<ToolDetails> getToolByTag(String toolTag) {
        List<ToolDetails> existingTool =  toolDetailsRepository.findByToolTag(toolTag);
//                .orElseThrow(() -> new ResourceNotFoundException("Tool not found with tag: " + tag));

        if (toolTag.equals("trending")){
            return toolSelector(existingTool,3); // for trending
        }else {
            return toolSelector(existingTool,6); // for recommend
        }
    }

    private List<ToolDetails> toolSelector(List<ToolDetails> existingTool, int numberOfCard) {
        Set<ToolDetails> selectedTool = new HashSet<>();
        Random random = new Random();
        while (selectedTool.size() < numberOfCard){
            selectedTool.add(existingTool.get(random.nextInt(existingTool.size())));
        }
        List<ToolDetails> ans = selectedTool.stream().toList();
        return  ans;
    }
//
//    public Category findCategoryByName(String categoryName) {
//        return categoryRepository.findByCategoryName(categoryName);
//    }
//
//    public ToolDetails saveToolDetails(ToolDetails toolDetails) {
//        return toolDetailsRepository.save(toolDetails);
//    }
>>>>>>> e8fed01 (New api to get tools with trending and recommended)
=======
>>>>>>> 8128aaf (discarded tool card)
//
//    public ToolDetails createToolDetail(ToolDetails toolDetail) {
//        return toolDetailsRepository.save(toolDetail);
//    }
//
//    public ToolDetails updateToolDetail(Long id, ToolDetails updatedToolDetail) {
//        // Check if the tool detail with the given ID exists
//        if (toolDetailsRepository.existsById(id)) {
//            updatedToolDetail.setId(id);
//            return toolDetailsRepository.save(updatedToolDetail);
//        } else {
//            // Handle the case where the tool detail does not exist
//            throw new RuntimeException("Tool detail with ID " + id + " not found");
//        }
//    }
//
//    public void deleteToolDetail(Long id) {
//        // Check if the tool detail with the given ID exists before deleting
//        if (toolDetailsRepository.existsById(id)) {
//            toolDetailsRepository.deleteById(id);
//        } else {
//            // Handle the case where the tool detail does not exist
//            throw new RuntimeException("Tool detail with ID " + id + " not found");
//        }
//    }

}
