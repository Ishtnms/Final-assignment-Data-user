package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class subjectScore {
    private String subject;
    private Integer score;
    private Integer fullScore;
    private Integer rank;
}
