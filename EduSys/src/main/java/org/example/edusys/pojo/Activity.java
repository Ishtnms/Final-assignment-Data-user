package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    private Integer id;
    private String name;
    private String description;
    private String status;
    private String date;
    private Integer participants;
    private String location;
    private String content;
    private String category;
}
