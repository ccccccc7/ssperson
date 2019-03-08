package com.ly.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ly.model.diary.Diary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author zyl
 */
@Mapper
@Component
public interface DiaryMapper extends BaseMapper<Diary> {
}
