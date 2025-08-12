package org.example.edusys.service.impl;

import org.example.edusys.mapper.SchoolMapper;
import org.example.edusys.pojo.*;
import org.example.edusys.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolMapper schoolMapper;

    @Override
    public TeacherResult getExcellentTeachers(Integer currentpage, Integer gender, Integer region, String name) {
        Integer pageStart = (currentpage-1)*9 +1 ;
        Integer pageEnd = currentpage*9;
        Integer total = schoolMapper.getExcellentTeachersTotal(gender,region,name);
        List<Teacher> excellentTeachers = schoolMapper.getExcellentTeachers(pageStart,pageEnd,gender,region,name);

        return new TeacherResult(total,excellentTeachers);
    }

    @Override
    public Teacher getReports(Integer id) {
        Teacher teacher = schoolMapper.getReports(id);
        return teacher;
    }

    @Override
    public List<EduDistribution> getEduDistribution(Integer schoolId) {
        return schoolMapper.getEduDistribution(schoolId);
    }

    @Override
    public List<TitleDistribution> getTitleDistribution(Integer schoolId) {
        return schoolMapper.getTitleDistribution(schoolId);
    }

    @Override
    public AwardStatistics getCompetitions() {
        AwardStatistics result = new AwardStatistics();
        result.setTotle(schoolMapper.getCompetitionsTotal());
        result.setSchool(schoolMapper.getCompetitionsSchool());
        return result;
    }
}
