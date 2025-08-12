package org.example.edusys.controller;

import org.example.edusys.pojo.LoginRequest;
import org.example.edusys.pojo.LoginResponse;
import org.example.edusys.pojo.Result;
import org.example.edusys.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("/login")
    public Result login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // 查询数据库验证用户
        String sql = "SELECT student_id, student_name FROM AboutStudents WHERE student_account = ? AND student_password = ?";
        List<Map<String, Object>> students = jdbcTemplate.queryForList(sql, username, password);

        if (students.isEmpty()) {
            // 登录失败
            return Result.error();
        } else {
            // 登录成功
            Map<String, Object> student = students.get(0);
            LoginResponse response = new LoginResponse();
            response.setUserId(((Number) student.get("student_id")).intValue());
            response.setUser((String) student.get("student_name"));
            response.setToken(TokenUtil.generateToken());

            return Result.success(response);
        }
    }
}
