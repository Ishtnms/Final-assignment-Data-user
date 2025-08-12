package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompetitionData {
    private Integer id;
    private String level;
    private String competitionName;
    private String date;
    private String subject;
    private String award;
    private Integer score;
    private Integer participants;
    private Integer rank;
}
