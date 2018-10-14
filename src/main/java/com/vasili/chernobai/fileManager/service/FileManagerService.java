package com.vasili.chernobai.fileManager.service;

import com.vasili.chernobai.fileManager.dao.FileManagerDAO;
import com.vasili.chernobai.fileManager.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileManagerService {

    @Autowired
    private FileManagerDAO fileManagerDAO;

    public List<File> getFilesList() {
        return fileManagerDAO.selectAll();
    }
}
