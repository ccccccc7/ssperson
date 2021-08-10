package com.ly.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.model.diary.*;
import com.ly.service.ExamMistakeService;
import dto.ResponseMapper;
import dto.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * examination review
 *
 * @author zyl
 */
@RestController
@RequestMapping(value = "/api/exam")
public class ExamController {

    @Autowired
    private ExamMistakeService examMistakeService;

    @PostMapping("/page")
    public RestfulResponse<IPage<ExamMistake>> selectPage(@RequestBody ExamMistakeQuery query) {
        IPage<ExamMistake> examMistakeIPage = examMistakeService.selectPage(query);
        return ResponseMapper.ok(examMistakeIPage);
    }

    @PostMapping("/add")
    public RestfulResponse<Long> add(@RequestBody ExamMistake mistake) {
        return ResponseMapper.ok(examMistakeService.addMistake(mistake));
    }

    @PostMapping("/type")
    public RestfulResponse<List<ExamMistakeType>> typeList(@RequestBody ExamMistakeTypeQuery query) {
        return ResponseMapper.ok(examMistakeService.selectTypeList(query));
    }

    @PostMapping("/details")
    public RestfulResponse<List<ExamMistakeDetail>> detailList(@RequestBody ExamMistakeDetailQuery query) {
        return ResponseMapper.ok(examMistakeService.selectDetailList(query));
    }

    @PostMapping("/detail/add")
    public RestfulResponse<Long> add(@RequestBody ExamMistakeDetail detail) {
        return ResponseMapper.ok(examMistakeService.addDetail(detail));
    }
}
