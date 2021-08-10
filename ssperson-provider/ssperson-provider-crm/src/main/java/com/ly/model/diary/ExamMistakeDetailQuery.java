package com.ly.model.diary;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import dto.BaseQuery;
import lombok.Data;

/**
 * @author dongshan
 */
@Data
public class ExamMistakeDetailQuery extends BaseQuery {
    private Long typeId;

    @Override
    public Wrapper<ExamMistakeDetail> getWrapper() {
        QueryWrapper<ExamMistakeDetail> wrapper = Wrappers.query();
        wrapper.eq("type_id", typeId);
        return wrapper;
    }
}
