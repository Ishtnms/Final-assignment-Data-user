package org.example.edusys.service;

import org.example.edusys.pojo.CompetitionInfo;
import org.example.edusys.pojo.CompetitionRequest;

import java.util.List;

public interface TestService {
    List<CompetitionInfo> getCompetitions();

    void postCompetition(Integer activityid, CompetitionRequest competitionRequest);
}
