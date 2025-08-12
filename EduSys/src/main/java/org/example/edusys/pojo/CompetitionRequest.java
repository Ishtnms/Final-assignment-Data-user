package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompetitionRequest {
    private Integer activityId;
    private String clazz;  // 使用clazz而不是class，因为class是Java关键字
    private String grade;
    private String idCard;
    private String name;
    private String phone;
    private String remarks;
    private String school;
    private String teacher;
    private Integer userId;
}
