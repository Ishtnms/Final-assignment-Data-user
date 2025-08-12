package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NowGrade {
    private String name;
    private String examNumber;
    private Integer totalScore;
    private Integer rank;
    private Integer provinceRank;
    private List<subjectScore> subjectScores;
}
