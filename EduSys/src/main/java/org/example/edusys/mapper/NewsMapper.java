package org.example.edusys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.edusys.pojo.News;

import java.util.List;

@Mapper
public interface NewsMapper {
//    @Select("SELECT * FROM (SELECT news_id as newsId " +
//            ", title ," +
//            " description ," +
//            "image_url as imageUrl" +
//            ",news_url as newsUrl" +
//            ",source," +
//            "publish_date as publishDate ," +
//            "ROW_NUMBER() OVER (ORDER BY publish_date DESC, news_id DESC) as rn " +
//            "FROM AboutNews) WHERE rn BETWEEN ${pageStart} AND ${pageEnd} " +
//            "ORDER BY rn")
    List<News> getNewsListofLast(Integer pageStart,Integer pageEnd);

    List<News> getNewsListofPolicy(Integer pageStart,Integer pageEnd);

    List<News> getNewsListofcampus(Integer pageStart,Integer pageEnd);

    List<News> getNewsListoftechnology(Integer pageStart,Integer pageEnd);
}
