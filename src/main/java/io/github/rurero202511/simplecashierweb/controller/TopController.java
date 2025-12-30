package io.github.rurero202511.simplecashierweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {

    private static final String VIEW_NAME = "top/index";

    @GetMapping
    public String execute() {

        // FIXME SCS-001 仮実装なので後で直す
        return VIEW_NAME;
    }
}
