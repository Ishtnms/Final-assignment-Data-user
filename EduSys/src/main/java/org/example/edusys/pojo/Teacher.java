package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private Integer teacherId;
    private String name;
    private String subject;
    private String img;
    private Integer schoolId;
    private Integer edu;
    private Integer age;
    private Integer gender;
    private Integer zhicheng;
    private String workExp;
    private String prize;
}
