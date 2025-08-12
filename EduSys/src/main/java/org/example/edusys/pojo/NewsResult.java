package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsResult {
   private List<News> latest;
   private List<News> policy;
   private List<News> campus;
   private List<News> technology;


}
