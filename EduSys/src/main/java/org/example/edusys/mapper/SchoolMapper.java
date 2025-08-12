package org.example.edusys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.edusys.pojo.*;

import java.util.List;

@Mapper
public interface SchoolMapper {
    Integer getExcellentTeachersTotal(Integer gender, Integer region, String name);

    List<Teacher> getExcellentTeachers(Integer pageStart, Integer pageEnd, Integer gender, Integer region, String name);

    Teacher getReports(Integer id);

    List<EduDistribution> getEduDistribution(Integer schoolId);

    List<TitleDistribution> getTitleDistribution(Integer schoolId);

    AwardTotal getCompetitionsTotal();

    List<SchoolAwardDetail> getCompetitionsSchool();
}
