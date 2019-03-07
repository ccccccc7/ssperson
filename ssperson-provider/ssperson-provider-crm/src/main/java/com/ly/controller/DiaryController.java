package com.ly.controller;

import com.ly.model.diary.Diary;
import com.ly.model.diary.DiaryQuery;
import com.ly.service.DiaryService;
import dto.ResponseMapper;
import dto.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zyl
 */
@RestController
@RequestMapping(value = "/api/dairy")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @PostMapping("/list")
    public RestfulResponse<List<Diary>> list(@RequestBody DiaryQuery query) {
        List<Diary> list = diaryService.selectList(query);
        return ResponseMapper.ok(list);
    }
}
