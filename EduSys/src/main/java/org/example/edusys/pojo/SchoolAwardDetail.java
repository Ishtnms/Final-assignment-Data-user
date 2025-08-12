package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolAwardDetail {
    private Integer id;
    private String name;
    private String logo;
    private Integer awardCount;
    private Integer teachers;
    private Integer national;
    private Integer provincial;
    private Integer municipal;
}
