package org.example.edusys.service;

import org.example.edusys.pojo.CompetitionData;
import org.example.edusys.pojo.GradeData;
import org.example.edusys.pojo.NowGrade;

import java.util.List;

public interface GradeService {

    NowGrade getNowGrade(Integer id);


    GradeData getRecentGrades(Integer id);

    List<CompetitionData> getInSchoolCompetition(Integer id);

    List<CompetitionData> getOutSchoolCompetition(Integer id);
}
