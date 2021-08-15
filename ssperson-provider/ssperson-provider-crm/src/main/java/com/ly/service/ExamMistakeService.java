package com.ly.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.model.diary.*;

import java.util.List;

/**
 * @author dongshan
 */
public interface ExamMistakeService {

    /**
     * query exam page
     *
     * @param query
     * @return
     */
    IPage<ExamMistake> selectPage(ExamMistakeQuery query);

    /**
     * add mistake
     *
     * @param mistake
     * @return
     */
    Long addMistake(ExamMistake mistake);

    /**
     * add exam mistake detail
     *
     * @param detail
     * @return
     */
    Long addDetail(ExamMistakeDetail detail);

    /**
     * delete mistake detail
     *
     * @param id
     */
    void deleteDetail(Long id);

    /**
     * query detail list
     *
     * @param query
     * @return
     */
    List<ExamMistakeDetail> selectDetailList(ExamMistakeDetailQuery query);

    /**
     * update detail
     *
     * @param detail
     * @return
     */
    Long updateDetailById(ExamMistakeDetail detail);

    /**
     *
     * @return
     */
    List<ExamMistakeType> selectTypeList(ExamMistakeTypeQuery query);

    /**
     *
     * @param query
     * @return
     */
    List<ExamMistake> selectList(ExamMistakeQuery query);
}
