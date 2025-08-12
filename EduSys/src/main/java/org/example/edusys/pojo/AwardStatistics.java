package org.example.edusys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AwardStatistics {
    // 总统计数据
    private AwardTotal totle;

    // 各学校详细数据
    private List<SchoolAwardDetail> school;
}
