package com.ly.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.model.diary.Replay;
import com.ly.model.diary.ReplayQuery;

/**
 * @author zyl
 */
public interface ReplayService {
    /**
     * select page
     *
     * @param query
     * @return
     */
    IPage<Replay> selectPage(ReplayQuery query);

    /**
     * add
     *
     * @param replay
     * @return
     */
    Long add(Replay replay);

    /**
     * delete
     *
     * @param id
     */
    void delete(Long id);

    /**
     * update
     *
     * @param replay
     * @return
     */
    Long update(Replay replay);
}
