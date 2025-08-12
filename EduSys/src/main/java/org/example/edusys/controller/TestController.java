package org.example.edusys.controller;

import org.example.edusys.pojo.CompetitionRequest;
import org.example.edusys.pojo.Result;
import org.example.edusys.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/api/competitions")
    public Result getCompetitions()
    {
        return Result.success(testService.getCompetitions());
    }

    @PostMapping("/api/competitions/{activityid}")
    public Result postCompetition(@PathVariable Integer activityid , @RequestBody CompetitionRequest competitionRequest)
    {
        testService.postCompetition(activityid, competitionRequest);
        return Result.success();
    }

}
