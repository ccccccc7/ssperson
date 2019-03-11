package com.ly.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
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
     *
     * @param query
     * @return
     */
    List<Diary> selectList(DiaryQuery query);

    /**
     * delete diary by id
     *
     * @param id
     */
    void deleteById(Long id);

    /**
     * add diary
     *
     * @param diary
     * @return
     */
    Long add(Diary diary);

    /**
     * update diary
     *
     * @param diary
     * @return
     */
    Long updateById(Diary diary);

    /**
     * page diary
     * @param query
     * @return
     */
    IPage<Diary> selectPage(DiaryQuery query);
}
