package com.ly.service;

import com.ly.model.diary.Diary;
import com.ly.model.diary.DiaryQuery;

import java.util.List;

/**
 * @author zyl
 */
public interface DiaryService {
    Diary selectById(Long id);

    /**
     * query list
     * @param query
     * @return
     */
    List<Diary> selectList(DiaryQuery query);
}
