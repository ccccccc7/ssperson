package com.ly.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ly.model.diary.Replay;
import com.ly.model.diary.ReplayQuery;
import com.ly.service.ReplayService;
import dto.ResponseMapper;
import dto.RestfulResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * replay controller
 *
 * @author zyl
 */

@RestController
@RequestMapping(value = "/api/replay")
public class ReplayController {
    @Autowired
    private ReplayService replayService;

    @PostMapping("/page")
    public RestfulResponse<IPage<Replay>> selectPage(@RequestBody ReplayQuery query) {
        IPage<Replay> replayIPage = replayService.selectPage(query);
        return ResponseMapper.ok(replayIPage);
    }

    @PostMapping()
    public RestfulResponse<Long> add(@RequestBody Replay replay) {
        Long id = replayService.add(replay);
        return ResponseMapper.ok(id);
    }

    @DeleteMapping("/{id}")
    public RestfulResponse delete(@PathVariable Long id) {
        replayService.delete(id);
        return ResponseMapper.ok();
    }

    @PutMapping()
    public RestfulResponse<Long> update(@RequestBody Replay replay) {
        return ResponseMapper.ok(replayService.update(replay));
    }

    @GetMapping("/{id}")
    public RestfulResponse<Replay> selectById(@PathVariable Long id) {
        return ResponseMapper.ok(replayService.selectById(id));
    }
}
