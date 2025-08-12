package org.example.edusys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.edusys.pojo.CompetitionInfo;
import org.example.edusys.pojo.CompetitionRequest;

import java.util.List;

@Mapper
public interface TestMapper {
    List<CompetitionInfo> getCompetitions();

    void postCompetition(CompetitionRequest competitionRequest);
}
