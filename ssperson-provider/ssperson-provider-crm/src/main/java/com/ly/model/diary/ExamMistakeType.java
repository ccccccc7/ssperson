package com.ly.model.diary;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author dongshan
 */
@Data
public class ExamMistakeType {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
}
