package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AwardTotal {
    private Integer totalAwards;
    private Integer nationalAwards;
    private Integer provincialAwards;
    private Integer municipalAwards;
}
