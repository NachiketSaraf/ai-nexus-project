//package com.ai.nexus.backend.service;
//
//
//import com.ai.nexus.backend.model.Category;
//import com.ai.nexus.backend.model.ToolCard;
//import com.ai.nexus.backend.repository.ToolCardRepository;
//import com.ai.nexus.backend.utils.SimpleCardUtils;
//
//import com.ai.nexus.backend.utils.CategoryButtonUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Hashtable;
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//@Service
//public class ToolCardService {
//    @Autowired
//    private ToolCardRepository toolCardRepository;
//
//    public List<ToolCard> getToolsByCategoryId(Category category) {
//        return toolCardRepository.findByCategory(category);
//    }
//
//    public List<String> getToolNamesByCategoryName(String categoryName) {
//        return toolCardRepository.findToolNamesByCategoryName(categoryName);
//    }
//
//    public List<Object[]> getToolNamesAndDescriptionsByCategoryName(String categoryName) {
//        return toolCardRepository.findToolNamesAndDescriptionsByCategoryName(categoryName);
//    }
//
//    public ToolCard getToolCardsByToolName(String name) {
//        return toolCardRepository.findByToolName(name);
//    }
//
//    public List<ToolCard> getAllToolName() {
////        List<ToolCard> tools = toolCardRepository.findAll();
////        List<String> result = new ArrayList<>();
////        for (ToolCard t: tools) {
////            result.add(t.getToolName());
////        }
//        return toolCardRepository.findAll();
//    }
//
//
////    public List<ToolCard> getToolsByCategory(String category) {
////        ToolCardRepository
////        return toolCardRepository.findByCategory(category);
////    }
////
////    public List<String> getButtons() {
////        return CategoryButtonUtils.getButton();
////    }
////    public Hashtable<String, String> getAllToolDescriptions() {
////        return SimpleCardUtils.getAllCardDis();
////    }
////
////
////
////    public ToolCard getToolCard(Long id) {
////        return toolCardRepository.findById(id).orElse(null);
////    }
//
//}