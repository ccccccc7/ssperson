package com.ly.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.mapper.ReplayMapper;
import com.ly.model.diary.Replay;
import com.ly.model.diary.ReplayQuery;
import com.ly.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * replay service impl
 *
 * @author zyl
 */
@Service
public class ReplayServiceImpl implements ReplayService {
    @Autowired
    private ReplayMapper replayMapper;

    @Override
    public IPage<Replay> selectPage(ReplayQuery query) {
        return replayMapper.selectPage(query.buildPage(), query.getWrapper());
    }

    @Override
    public Long add(Replay replay) {
        replayMapper.insert(replay);
        return replay.getId();
    }

    @Override
    public void delete(Long id) {
        replayMapper.deleteById(id);
    }

    @Override
    public Long update(Replay replay) {
        replayMapper.updateById(replay);
        return replay.getId();
    }

    @Override
    public Replay selectById(Long id) {
        return replayMapper.selectById(id);
    }
}
