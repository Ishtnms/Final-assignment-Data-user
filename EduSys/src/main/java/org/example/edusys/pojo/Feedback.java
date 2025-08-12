package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    private String id;
    private String name;
    private String contact;
    private String type;
    private String subject;
    private String content;
    private String date;
    private String status;
    private String reply;
    private String replyDate;
}
