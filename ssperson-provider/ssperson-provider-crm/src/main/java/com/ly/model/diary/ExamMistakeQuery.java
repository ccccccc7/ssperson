package com.ly.model.diary;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import dto.BaseQuery;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author dongshan
 */
@Data
public class ExamMistakeQuery extends BaseQuery {
    private LocalDate createDate;
    private LocalDate endDate;
    private Long typeId;

    @Override
    public Wrapper<ExamMistake> getWrapper() {
        QueryWrapper<ExamMistake> wrapper = Wrappers.query();
        wrapper.eq(typeId != null, "type_id", typeId)
                .ge(createDate != null, "create_date", createDate)
                .le(endDate != null, "create_date", endDate);
        return wrapper;
    }
}
