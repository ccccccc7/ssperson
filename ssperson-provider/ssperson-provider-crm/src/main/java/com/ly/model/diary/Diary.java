package com.ly.model.diary;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author zyl
 */
@Data
public class Diary {
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private LocalDate createDate;

    private LocalDate businessDate;

    private String title;

    private String content;

    private String href;
}
