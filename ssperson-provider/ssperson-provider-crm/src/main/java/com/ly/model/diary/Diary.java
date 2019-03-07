package com.ly.model.diary;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author zyl
 */
@Data
public class Diary {
    private Long id;

    /**
     * 创建时间
     */
    private LocalDate createDate;

    private LocalDate businessDate;

    private String title;

    private String content;
}
