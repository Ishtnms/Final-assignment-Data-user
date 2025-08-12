package org.example.edusys.controller;

import org.example.edusys.pojo.*;
import org.example.edusys.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @GetMapping("/school/teachers/excellent")
    public Result getExcellentTeachers(Integer currentPage,Integer gender,Integer region,String name)
    {
        TeacherResult teacherResult = schoolService.getExcellentTeachers(currentPage,gender,region,name);
        return Result.success(teacherResult);
    }
    @GetMapping("/school/teachers/reports")
    public Result getReports(Integer id)
    {
        Teacher teacher = schoolService.getReports(id);
        return Result.success(teacher);
    }
    @GetMapping("/school/teachers/edu-distribution")
    public Result getEduDistribution(Integer schoolId)
    {
        List<EduDistribution> eduDistribution = schoolService.getEduDistribution(schoolId);
        return Result.success(eduDistribution);
    }
    @GetMapping("/school/teachers/title-distribution")
    public Result getTitleDistribution(Integer schoolId)
    {
        List<TitleDistribution> titleDistribution = schoolService.getTitleDistribution(schoolId);
        return Result.success(titleDistribution);
    }
    @GetMapping("/school/students/competitions")
    public Result getCompetitions()
    {
        AwardStatistics awardStatistics = schoolService.getCompetitions();
        return Result.success(awardStatistics);
    }

}
