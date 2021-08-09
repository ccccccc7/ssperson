package com.ly.model.diary;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author dongshan
 */
@Data
public class ExamMistake {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long typeId;

    private String typeName;

    private Long detailId;

    private String detailName;

    private Float timeCount;

    private Integer count;

    private LocalDate createDate;

}
