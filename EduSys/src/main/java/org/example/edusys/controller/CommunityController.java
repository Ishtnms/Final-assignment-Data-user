package org.example.edusys.controller;

import org.example.edusys.pojo.Result;
import org.example.edusys.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunityController {
    @Autowired
    CommunityService communityService;
    @GetMapping("/api/problems/list")
    public Result getCommunityList(Integer page , String tabName){

        return Result.success(communityService.getCommunityList(page,tabName));
    }
}
