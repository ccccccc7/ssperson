package com.ly.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ly.model.diary.Diary;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zyl
 */
@Mapper
public interface DiaryMapper extends BaseMapper<Diary> {
}
