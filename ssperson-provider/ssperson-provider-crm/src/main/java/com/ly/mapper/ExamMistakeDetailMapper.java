package com.ly.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ly.model.diary.ExamMistakeDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ExamMistakeDetailMapper extends BaseMapper<ExamMistakeDetail> {
}
