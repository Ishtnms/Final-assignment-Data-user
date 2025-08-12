package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamData {
    private Integer id;
    private String examName;
    private String date;
    private Integer chinese;
    private Integer math;
    private Integer english;
    private Integer physics;
    private Integer chemistry;
    private Integer biology;
    private Integer total;
    private Integer classRank;
    private Integer gradeRank;
}
