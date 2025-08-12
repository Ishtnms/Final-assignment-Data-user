package org.example.edusys.service;

import org.example.edusys.pojo.News;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NewsService {
    List<News> getNewsListofLast(Integer page);

    List<News> getNewsListofPolicy(Integer page);

    List<News> getNewsListofcampus(Integer page);

    List<News> getNewsListoftechnology(Integer page);
}
