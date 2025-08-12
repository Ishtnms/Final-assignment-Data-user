package org.example.edusys.service.impl;

import org.example.edusys.mapper.TestMapper;
import org.example.edusys.pojo.CompetitionInfo;
import org.example.edusys.pojo.CompetitionRequest;
import org.example.edusys.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public List<CompetitionInfo> getCompetitions() {
        return testMapper.getCompetitions();
    }

    @Override
    public void postCompetition(Integer activityid, CompetitionRequest competitionRequest) {
        competitionRequest.setActivityId(activityid);
        testMapper.postCompetition(competitionRequest);
    }
}
