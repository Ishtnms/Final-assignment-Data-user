package org.example.edusys.controller;

import org.apache.ibatis.annotations.Param;
import org.example.edusys.pojo.News;
import org.example.edusys.pojo.NewsResult;
import org.example.edusys.pojo.Result;
import org.example.edusys.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news/list")
    public Result getNewsList(Integer page){

        List<News> newsListofLast = newsService.getNewsListofLast(page);
        List<News> newsListofPolicy = newsService.getNewsListofPolicy(page);
        List<News> newsListofcampus = newsService.getNewsListofcampus(page);
        List<News> newsListoftechnology = newsService.getNewsListoftechnology(page);
        return Result.success(new NewsResult(newsListofLast,newsListofPolicy,newsListofcampus,newsListoftechnology));
    }
}
