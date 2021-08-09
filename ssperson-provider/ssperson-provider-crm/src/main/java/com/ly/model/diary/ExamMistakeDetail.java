package com.ly.model.diary;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author dongshan
 */
@Data
public class ExamMistakeDetail {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long typeId;

    private String name;
}
