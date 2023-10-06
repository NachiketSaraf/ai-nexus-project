package com.ai.nexus.backend.utils;

import java.util.Arrays;
import java.util.List;

public class CategoryButtonUtils {

    private static String[] categoriesArr = {
            "All", "Design", "Productivity", "Copywriting", "Startup Tools", "Content Creation",
            "Life Assistant", "Code Assistant", "Educational", "Resources", "Video Editing",
            "Video Generator", "Image Generator", "Image Editing", "Automation", "Writing", "SEO",
            "Email Assistant", "Developer Tools", "Fun Tools", "Finance", "Storytelling", "ChatBots",
            "Legal Assistant", "Research", "Ecommerce", "Marketing", "Logo Generator",
            "Real Estate", "Travel", "Fashion", "Healthcare", "Avatar", "Spreadsheets", "Search Engine",
            "Career", "Social Media Assistant", "Music", "Gaming", "Audio", "Build AI", "Art",
            "Text-to-speech", "Experiments", "Gift Ideas", "Presentations", "Prompt Tool"
    };
    public static List<String> getButton(){

        return Arrays.stream(categoriesArr).toList() ;
    }

}
