package org.example.edusys.service.impl;

import org.example.edusys.mapper.CommunityMapper;
import org.example.edusys.pojo.Feedback;
import org.example.edusys.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    CommunityMapper communityMapper;

    @Override
    public Object getCommunityList(Integer page, String tabName) {
        List<Feedback> feedbacks = new ArrayList<>();

        feedbacks.add(new Feedback("2025001", "张三", "138****1234", "teaching",
                "关于学校食堂饭菜质量问题的反映",
                "尊敬的领导，我是某中学的学生家长，近期发现学校食堂饭菜质量有所下降，希望得到关注和改善。",
                "2025-07-28 14:30:22", "已解决",
                "感谢您的反馈，我们已联系学校负责人进行整改，并会加强监督。",
                "2025-07-29 09:15:45"));

        feedbacks.add(new Feedback("2025002", "李四", "lisi@email.com", "facility",
                "建议增加学校体育设施",
                "建议在各中小学增加体育设施，促进学生身体素质发展。",
                "2025-07-27 10:15:30", "处理中",
                null, null));

        feedbacks.add(new Feedback("2025003", "王五", "139****5678", "management",
                "关于教师队伍建设的建议",
                "希望加强教师培训，提升教学质量。",
                "2025-07-26 16:42:11", "已解决",
                "您的建议很好，我们正在制定相关教师培训计划。",
                "2025-07-27 11:20:33"));

        feedbacks.add(new Feedback("2025004", "赵六", "zhaoliu@email.com", "other",
                "反映某学校乱收费问题",
                "某学校存在乱收费现象，请予以调查处理。",
                "2025-07-25 09:20:18", "处理中",
                null, null));

        feedbacks.add(new Feedback("2025005", "钱七", "qianqi@email.com", "teaching",
                "关于学生课业负担过重的问题",
                "小学生课业负担过重，建议合理安排作业量。",
                "2025-07-24 15:40:05", "已解决",
                "我们将进一步规范办学行为，切实减轻学生课业负担。",
                "2025-07-25 10:30:12"));

        return feedbacks;
    }
}
