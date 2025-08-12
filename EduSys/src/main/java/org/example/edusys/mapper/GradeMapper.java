package org.example.edusys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.edusys.pojo.NowGrade;
import org.example.edusys.pojo.subjectScore;

import java.util.List;

@Mapper
public interface GradeMapper {
    NowGrade getNowGrade(Integer id);

    List<subjectScore> getSubjectScores(Integer id);
}
