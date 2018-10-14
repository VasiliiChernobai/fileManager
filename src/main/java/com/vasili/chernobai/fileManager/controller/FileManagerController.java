package com.vasili.chernobai.fileManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/folder")
public class FileManagerController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {

        return "Test!";
    }
}
