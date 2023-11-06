package com.ai.nexus.backend.service;


import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolDetails;
import com.ai.nexus.backend.repository.CategoryRepository;
import com.ai.nexus.backend.repository.ToolDetailsRepository;
import jakarta.transaction.Transactional;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ToolDetailsService {
    @Autowired
    private  ToolDetailsRepository toolDetailsRepository;

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
    public List<ToolDetails> updateToolImages(List<Map<String, String>> toolUpdates) {
        List<ToolDetails> updatedTools = new ArrayList<>();

        for (Map<String, String> toolUpdate : toolUpdates) {
            String toolName = toolUpdate.get("toolName");
            String toolImage = toolUpdate.get("toolImage");

            if (toolName != null && toolImage != null) {
                ToolDetails tool = toolDetailsRepository.findByToolName(toolName);
                if (tool != null) {
                    tool.setToolImage(toolImage);
                    updatedTools.add(toolDetailsRepository.save(tool));
                }
            }
        }

        return updatedTools;
    }


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
    public ToolDetails updateToolDetails(Long toolId, ToolDetails updatedToolDetails) {
        ToolDetails existingTool = toolDetailsRepository.findById(toolId)
                .orElseThrow(() -> new ResourceNotFoundException("Tool not found with id: " + toolId));

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
