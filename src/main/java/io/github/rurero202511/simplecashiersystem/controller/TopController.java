package io.github.rurero202511.simplecashiersystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopController {

    @GetMapping
    public String hello() {

        // FIXME SCS-001 仮実装なので後で直す
        return "hoge";
    }
}
