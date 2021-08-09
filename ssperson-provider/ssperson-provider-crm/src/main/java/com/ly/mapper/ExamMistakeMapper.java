package com.ly.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ly.model.diary.ExamMistake;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author dongshan
 */
@Mapper
@Component
public interface ExamMistakeMapper extends BaseMapper<ExamMistake> {

}
