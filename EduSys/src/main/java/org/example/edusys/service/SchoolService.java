package org.example.edusys.service;

import org.example.edusys.pojo.*;

import java.util.List;

public interface SchoolService {
    TeacherResult getExcellentTeachers(Integer currentpage, Integer gender, Integer region, String name);

    Teacher getReports(Integer id);

    List<EduDistribution> getEduDistribution(Integer schoolId);

    List<TitleDistribution> getTitleDistribution(Integer schoolId);

    AwardStatistics getCompetitions();
}
