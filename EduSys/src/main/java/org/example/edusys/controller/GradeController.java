package org.example.edusys.controller;

import org.example.edusys.pojo.Result;
import org.example.edusys.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {
    @Autowired
    GradeService gradeService;

    @GetMapping("/api/grade")
    public Result getGrade(Integer id) {

        return Result.success(gradeService.getNowGrade(id));
    }

    @GetMapping("/api/grades/recent")
    public Result getRecentGrades(Integer id) {
        return Result.success(gradeService.getRecentGrades(id));
    }

    @GetMapping("/api/grades/competition/inschool")
    public Result getInSchoolCompetition(Integer id) {
        return Result.success(gradeService.getInSchoolCompetition(id));
    }
    @GetMapping("/api/grades/competition/outschool")
    public Result getOutSchoolCompetition(Integer id) {
        return Result.success(gradeService.getOutSchoolCompetition(id));
    }
}
