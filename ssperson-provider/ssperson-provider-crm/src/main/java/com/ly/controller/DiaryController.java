package com.ly.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.model.diary.Diary;
import com.ly.model.diary.DiaryQuery;
import com.ly.service.DiaryService;
import dto.ResponseMapper;
import dto.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zyl
 */
@RestController
@RequestMapping(value = "/api/diary")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @PostMapping("/list")
    public RestfulResponse<List<Diary>> list(@RequestBody DiaryQuery query) {
        List<Diary> list = diaryService.selectList(query);
        return ResponseMapper.ok(list);
    }

    @DeleteMapping("/{id}")
    public RestfulResponse delete(@PathVariable Long id) {
        diaryService.deleteById(id);
        return ResponseMapper.ok();
    }

    @PostMapping("/add")
    public RestfulResponse<Long> add(@RequestBody Diary diary){
        Long id = diaryService.add(diary);
        return ResponseMapper.ok(id);
    }

    @GetMapping("/{id}")
    public RestfulResponse<Diary> detail(@PathVariable Long id) {
        Diary diary = diaryService.selectById(id);
        return ResponseMapper.ok(diary);
    }

    @PutMapping("")
    public RestfulResponse update(@RequestBody Diary diary) {
        diaryService.updateById(diary);
        return ResponseMapper.ok();
    }

    @PostMapping("/page")
    public RestfulResponse<IPage<Diary>> selectPage(@RequestBody DiaryQuery diary) {
        IPage<Diary> page = diaryService.selectPage(diary);
        return ResponseMapper.ok(page);
    }
}
