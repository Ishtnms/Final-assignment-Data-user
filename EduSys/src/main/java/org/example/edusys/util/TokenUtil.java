package org.example.edusys.util;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class TokenUtil {
    // 存储有效的token
    private static Set<String> validTokens = new HashSet<>();

    public static String generateToken() {
        String token = UUID.randomUUID().toString().replace("-", "");
        validTokens.add(token);
        return token;
    }

    public static boolean validateToken(String token) {
        return token != null && validTokens.contains(token);
    }

    public static void removeToken(String token) {
        validTokens.remove(token);
    }
}

