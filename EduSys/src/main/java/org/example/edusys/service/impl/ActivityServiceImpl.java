package org.example.edusys.service.impl;

import org.example.edusys.mapper.ActivityMapper;
import org.example.edusys.pojo.Activity;
import org.example.edusys.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityMapper activityMapper;

    @Override
    public List<Activity> getActivityList(Integer page) {
        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity(1, "学术讲座：人工智能前沿技术",
                "邀请知名学者分享人工智能领域的最新研究成果和发展趋势",
                "报名中", "2025-08-15 14:00", 128, "学术报告厅A101",
                "本次讲座将深入探讨人工智能在图像识别、自然语言处理等领域的最新进展，以及在教育、医疗等行业的应用前景。欢迎对AI技术感兴趣的同学和老师参加。",
                "student"));

        activities.add(new Activity(2, "校园篮球联赛",
                "全校范围内的篮球比赛，展现青春活力和团队精神",
                "报名中", "2025-08-20 09:00", 86, "体育馆篮球场",
                "校园篮球联赛即将开始，欢迎各学院组队报名参加。比赛分为小组赛和淘汰赛两个阶段，最终获胜队伍将获得丰厚奖品和荣誉证书。",
                "student"));

        activities.add(new Activity(3, "教师教学技能大赛",
                "提升教师教学水平，展示优秀教学案例",
                "即将开始", "2025-08-25 08:30", 42, "教学楼B201",
                "本次教学技能大赛旨在促进教师之间的教学经验交流，提升整体教学水平。参赛教师将展示自己的教学设计和课堂组织能力，由专家评委进行评分。",
                "teacher"));

        activities.add(new Activity(4, "文艺晚会",
                "才艺展示平台，展现师生艺术风采",
                "已截止", "2025-09-01 19:00", 210, "大礼堂",
                "年度文艺晚会即将举行，现节目征集已结束。晚会将包括歌舞、相声、小品等多种形式的表演，为全校师生带来一场视听盛宴。",
                "all"));

        activities.add(new Activity(5, "科技创新作品展",
                "展示学生科技创新成果，激发创新思维",
                "报名中", "2025-09-10 10:00", 64, "科技馆一楼",
                "科技创新作品展为同学们提供展示创新成果的平台，涵盖电子、机械、软件等多个领域。优秀作品将有机会推荐参加省级或国家级比赛。",
                "student"));

        activities.add(new Activity(6, "学科知识竞赛",
                "各学科知识竞赛，提升专业能力",
                "报名中", "2025-09-15 13:30", 97, "教学楼C区",
                "学科知识竞赛涵盖数学、物理、化学、生物等多个学科，旨在检验同学们的学习成果，激发学习兴趣。比赛分为初赛和决赛两个阶段。",
                "student"));

        activities.add(new Activity(7, "家庭教育讲座",
                "探讨现代家庭教育理念和方法",
                "报名中", "2025-08-18 15:00", 72, "家长接待中心",
                "本次讲座邀请知名教育专家，围绕亲子沟通、学习习惯培养等家长关心的话题进行深入讲解，帮助家长更好地陪伴孩子成长。",
                "family"));

        activities.add(new Activity(8, "教师户外拓展",
                "增强教师团队凝聚力，放松身心",
                "即将开始", "2025-08-22 08:00", 38, "郊外拓展基地",
                "组织教师前往郊外进行团队拓展活动，通过一系列趣味项目增强团队协作能力，同时放松身心，缓解工作压力。",
                "teacher"));

        return activities ;
    }
}
