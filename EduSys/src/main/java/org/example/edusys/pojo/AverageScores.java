package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AverageScores {
    private Double chinese;
    private Double math;
    private Double english;
    private Double physics;
    private Double chemistry;
    private Double biology;
    private Double total;
}
