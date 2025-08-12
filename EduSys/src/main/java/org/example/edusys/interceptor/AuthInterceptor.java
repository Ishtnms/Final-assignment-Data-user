package org.example.edusys.interceptor;

import org.example.edusys.util.TokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求路径
        String requestURI = request.getRequestURI();

        // 放行不需要拦截的路径
        if (requestURI.startsWith("/user/login") ||
                requestURI.startsWith("/news/list") ||
                requestURI.startsWith("/school/teachers/excellent") ||
                requestURI.startsWith("/school/teachers/reports") ||
                requestURI.startsWith("/school/teachers/edu-distribution") ||
                requestURI.startsWith("/school/teachers/title-distribution") ||
                requestURI.startsWith("/school/students/competitions")) {
            return true;
        }

        // 验证token
        String token = request.getHeader("Authorization");
        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }

        if (TokenUtil.validateToken(token)) {
            return true;
        }

        // token验证失败，返回401
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write("{\"code\": 401, \"message\": \"用户未登录\"}");
        return false;
    }
}
