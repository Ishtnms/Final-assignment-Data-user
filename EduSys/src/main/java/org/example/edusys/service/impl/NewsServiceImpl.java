package org.example.edusys.service.impl;

import org.example.edusys.mapper.NewsMapper;
import org.example.edusys.pojo.News;
import org.example.edusys.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsMapper newsMapper;
    @Override
    public List<News> getNewsListofLast(Integer page) {

        Integer pageStart,pageEnd;
        pageStart = (page -1)*6 +1;
        pageEnd = page*6;
        return newsMapper.getNewsListofLast(pageStart,pageEnd);
    }

    @Override
    public List<News> getNewsListofPolicy(Integer page) {

        Integer pageStart,pageEnd;
        pageStart = (page -1)*6+1;
        pageEnd = page*6;
        return newsMapper.getNewsListofPolicy(pageStart,pageEnd);
    }

    @Override
    public List<News> getNewsListofcampus(Integer page) {
        Integer pageStart,pageEnd;
        pageStart = (page -1)*6+1;
        pageEnd = page*6;
        return newsMapper.getNewsListofcampus(pageStart,pageEnd);
    }

    @Override
    public List<News> getNewsListoftechnology(Integer page) {
        Integer pageStart,pageEnd;
        pageStart = (page -1)*6+1;
        pageEnd = page*6;
        return newsMapper.getNewsListoftechnology(pageStart,pageEnd);
    }
}
