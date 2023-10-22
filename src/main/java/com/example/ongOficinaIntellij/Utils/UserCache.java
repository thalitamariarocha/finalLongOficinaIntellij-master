package com.example.ongOficinaIntellij.Utils;
import java.util.HashMap;
import java.util.Map;

public class UserCache {
    private static Map<String, Long> userCache = new HashMap<>();

    public static void setUserLoggedIn(Long loginId) {
        userCache.put("userId", loginId);
    }

    public static Long getLoggedInUserId() {
        return userCache.get("userId");
    }
}
