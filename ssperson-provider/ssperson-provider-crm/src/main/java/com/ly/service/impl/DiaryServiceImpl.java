package com.ly.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.mapper.DiaryMapper;
import com.ly.model.diary.Diary;
import com.ly.model.diary.DiaryQuery;
import com.ly.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyl
 */
@Service
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    private DiaryMapper diaryMapper;

    @Override
    public Diary selectById(Long id) {
        return diaryMapper.selectById(id);
    }

    @Override
    public List<Diary> selectList(DiaryQuery query) {
        return diaryMapper.selectList(query.getWrapper());
    }

    @Override
    public void deleteById(Long id) {
        diaryMapper.deleteById(id);
    }

    @Override
    public Long add(Diary diary) {
        diaryMapper.insert(diary);
        return diary.getId();
    }

    @Override
    public Long updateById(Diary diary) {
        diaryMapper.updateById(diary);
        return diary.getId();
    }

    @Override
    public IPage<Diary> selectPage(DiaryQuery query) {
        return diaryMapper.selectPage(query.buildPage(), query.getWrapper());
    }
}
