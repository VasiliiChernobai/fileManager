package com.vasili.chernobai.fileManager.controller;

import com.vasili.chernobai.fileManager.model.File;
import com.vasili.chernobai.fileManager.service.FileManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/folder")
public class FileManagerController {

    @Autowired
    private FileManagerService fileManagerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<File> list() {

        return fileManagerService.getFilesList();
    }
}
