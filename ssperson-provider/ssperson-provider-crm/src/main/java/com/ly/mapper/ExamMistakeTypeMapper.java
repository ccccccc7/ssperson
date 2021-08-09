package com.ly.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ly.model.diary.ExamMistakeType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author dongshan
 */
@Mapper
@Component
public interface ExamMistakeTypeMapper extends BaseMapper<ExamMistakeType> {
}
