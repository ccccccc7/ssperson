package com.ly.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.mapper.ExamMistakeDetailMapper;
import com.ly.mapper.ExamMistakeMapper;
import com.ly.mapper.ExamMistakeTypeMapper;
import com.ly.model.diary.*;
import com.ly.service.ExamMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyl
 */
@Service
public class ExamMistakeServiceImpl implements ExamMistakeService {

    @Autowired
    private ExamMistakeMapper examMistakeMapper;

    @Autowired
    private ExamMistakeTypeMapper examMistakeTypeMapper;

    @Autowired
    private ExamMistakeDetailMapper examMistakeDetailMapper;

    @Override
    public IPage<ExamMistake> selectPage(ExamMistakeQuery query) {
        return examMistakeMapper.selectPage(query.buildPage(), query.getWrapper());
    }

    @Override
    public Long addMistake(ExamMistake mistake) {
        mistake.setTypeName(examMistakeTypeMapper.selectById(mistake.getTypeId()).getName());
        if (mistake.getDetailId() != null) {
            mistake.setDetailName(examMistakeDetailMapper.selectById(mistake.getDetailId()).getName());
        }
        examMistakeMapper.insert(mistake);
        return mistake.getId();
    }

    @Override
    public Long addDetail(ExamMistakeDetail detail) {
        examMistakeDetailMapper.insert(detail);
        return detail.getId();
    }

    @Override
    public void deleteDetail(Long id) {

    }

    @Override
    public List<ExamMistakeDetail> selectDetailList(ExamMistakeDetailQuery query) {
        return examMistakeDetailMapper.selectList(query.getWrapper());
    }

    @Override
    public Long updateDetailById(ExamMistakeDetail detail) {
        return null;
    }

    @Override
    public List<ExamMistakeType> selectTypeList(ExamMistakeTypeQuery query) {
        return examMistakeTypeMapper.selectList(query.getWrapper());
    }
}
