package com.ai.nexus.backend.utils;

import java.util.Hashtable;

public class SimpleCardUtils {
    private static Hashtable<String,String> cardTable  = new Hashtable<>();

    static {
        cardTable.put("RestorePhotos", "Restore old and blurry photos with AI…");
        cardTable.put("AI Lawyer", "Personal AI-lawyer at your fingertips…");
        cardTable.put("ControlNet v1", "Make amazing promo videos using AI in just a few seconds. It’s super easy…");
        cardTable.put("Consensus AI", "A new search engine that uses AI to find answers in scientific research…");
        cardTable.put("AI Backdrop", "Generate Realistic backgrounds for your product photos in seconds….");
        cardTable.put("YOUR", "Love");
    }
    public static Hashtable<String, String> getAllCardDis(){
        return cardTable;
    }

//    public static String getAllCardName() {
//       return cardTable.keySet().toString();
//    }


}
