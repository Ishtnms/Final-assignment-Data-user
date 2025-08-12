package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompetitionInfo {
    private Integer id;
    private String name;
    private String subject;
    private String level;
    private String registrationDeadline;
    private String competitionDate;
    private String target;
    private String fee;
    private String description;
}
