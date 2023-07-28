package com.lizza.auto.injection.controller;

import com.lizza.auto.injection.entity.Binlog;
import com.lizza.auto.injection.entity.Result;
import com.lizza.auto.injection.service.BinlogConsumer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("backdoor")
public class BackdoorController {

    @Resource
    private BinlogConsumer binlogConsumer;

    @GetMapping("hello")
    public String hello() {
        return "hello auto-injection";
    }

    @PostMapping("handle")
    public String handle(@RequestBody Binlog entity) {
        return binlogConsumer.handle(entity);
    }

    @GetMapping("getResult")
    public Result<Void> getResult(int code) {
        if (code == 1) {
            return Result.ofSuccess(null);
        }
        return Result.ofError(-1, "语言类型不匹配: 1");
    }
}
