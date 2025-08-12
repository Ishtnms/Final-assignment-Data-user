package org.example.edusys.service;

import org.example.edusys.pojo.Activity;

import java.util.List;

public interface ActivityService {
    List<Activity> getActivityList(Integer page);
}
