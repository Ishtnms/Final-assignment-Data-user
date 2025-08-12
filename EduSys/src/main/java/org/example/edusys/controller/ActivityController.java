package org.example.edusys.controller;

import org.example.edusys.pojo.Result;
import org.example.edusys.service.ActivityService;
import org.example.edusys.service.impl.ActivityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
    @Autowired
    ActivityService activityService;
    @GetMapping("/api/activities")
    public Result getActivityList(Integer page)
    {
        return Result.success(activityService.getActivityList(page));
    }
}
