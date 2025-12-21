package io.github.rurero202511.simplecashierweb.presentation.top.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopController {

    @GetMapping
    public String execute() {

        // FIXME SCS-001 仮実装なので後で直す
        return "hoge";
    }
}
