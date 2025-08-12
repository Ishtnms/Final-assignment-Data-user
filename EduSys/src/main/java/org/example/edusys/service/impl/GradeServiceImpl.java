package org.example.edusys.service.impl;

import org.example.edusys.mapper.GradeMapper;
import org.example.edusys.pojo.*;
import org.example.edusys.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    GradeMapper gradeMapper;

    public NowGrade getNowGrade(Integer id) {
        // 获取学生基本信息和总成绩
        NowGrade nowGrade = gradeMapper.getNowGrade(id);

        if (nowGrade != null) {
            // 设置准考证号（这里可以按需生成规则）
            nowGrade.setExamNumber("2025" + String.format("%06d", id));

            // 获取各科成绩
            List<subjectScore> subjectScores = gradeMapper.getSubjectScores(id);
            nowGrade.setSubjectScores(subjectScores);
        }
        System.out.println(nowGrade.toString());
        return nowGrade;
    }

    @Override
    public GradeData getRecentGrades(Integer id) {
        // 创建考试数据列表
        List<ExamData> examDataList = new ArrayList<>();

        // 添加考试数据
        examDataList.add(new ExamData(1, "高三上学期第一次月考", "2024-09-15", 118, 135, 128, 85, 80, 78, 614, 15, 85));
        examDataList.add(new ExamData(2, "高三上学期第二次月考", "2024-10-20", 122, 140, 132, 88, 85, 82, 649, 12, 68));
        examDataList.add(new ExamData(3, "高三上学期第三次月考", "2024-11-25", 125, 138, 135, 90, 87, 85, 660, 10, 62));
        examDataList.add(new ExamData(4, "高三上学期第四次月考", "2024-12-30", 128, 142, 138, 92, 89, 87, 676, 8, 52));
        examDataList.add(new ExamData(5, "高三下学期第一次月考", "2025-02-20", 130, 145, 140, 94, 91, 89, 689, 5, 38));
        examDataList.add(new ExamData(6, "高三下学期第二次月考", "2025-03-25", 132, 147, 142, 95, 93, 89, 700, 3, 25));
        examDataList.add(new ExamData(7, "高三下学期第三次月考", "2025-04-30", 135, 148, 145, 96, 95, 92, 711, 2, 18));

        // 创建平均分数据
        AverageScores averageScores = new AverageScores(127.9, 141.9, 137.5, 91.6, 89.1, 86.6, 666.6);

        // 返回完整的成绩数据
        return new GradeData(examDataList, averageScores);
    }

    @Override
    public List<CompetitionData> getInSchoolCompetition(Integer id) {
        // 创建竞赛数据列表
        List<CompetitionData> competitionDataList = new ArrayList<>();

        // 添加竞赛数据
        competitionDataList.add(new CompetitionData(1,"" ,"校数学竞赛", "2024-10-15", "数学", "一等奖", 95, 120, 1));
        competitionDataList.add(new CompetitionData(2, "","校物理竞赛", "2024-11-20", "物理", "二等奖", 88, 95, 5));
        competitionDataList.add(new CompetitionData(3,"" ,"校化学竞赛", "2024-12-10", "化学", "一等奖", 92, 80, 1));
        competitionDataList.add(new CompetitionData(4, "" ,"校英语演讲比赛", "2025-03-05", "英语", "三等奖", 85, 65, 12));
        competitionDataList.add(new CompetitionData(5,"" , "校语文作文竞赛", "2025-04-18", "语文", "二等奖", 89, 110, 8));
        competitionDataList.add(new CompetitionData(6, "" ,"校生物实验竞赛", "2025-05-22", "生物", "一等奖", 96, 70, 1));

        return competitionDataList;
    }

    @Override
    public List<CompetitionData> getOutSchoolCompetition(Integer id) {
        // 创建校外竞赛数据列表
        List<CompetitionData> competitionDataList = new ArrayList<>();

        // 添加校外竞赛数据
        competitionDataList.add(new CompetitionData(1, "国家级", "全国中学生数学奥林匹克竞赛", "2024-11-10", "数学", "银牌", 85, 320, 28));
        competitionDataList.add(new CompetitionData(2,"国家级", "全国中学生物理竞赛",  "2024-09-22", "物理", "铜牌", 78, 450, 65));
        competitionDataList.add(new CompetitionData(3, "省级","省化学竞赛",  "2024-12-05", "化学", "一等奖", 92, 180, 3));
        competitionDataList.add(new CompetitionData(4, "市级","市英语能力竞赛",  "2025-01-18", "英语", "特等奖", 96, 95, 1));
        competitionDataList.add(new CompetitionData(5,"国家级",  "全国生物联赛", "2025-05-12", "生物", "金牌", 94, 280, 5));
        competitionDataList.add(new CompetitionData(6, "省级", "省作文大赛", "2025-03-30", "语文", "二等奖", 88, 210, 15));

        return competitionDataList;
    }
}
