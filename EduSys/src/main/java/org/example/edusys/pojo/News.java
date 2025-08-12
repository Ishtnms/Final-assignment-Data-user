package org.example.edusys.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
   private Integer newsId;
   private Integer source;
   private String title;
   private  String description;
   private  String imageUrl;
   private  String newsUrl ;

   private String publishDate;

}
