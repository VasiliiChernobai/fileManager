package com.vasili.chernobai.fileManager.dao;

import com.vasili.chernobai.fileManager.model.File;

import java.util.List;

public interface FileManagerDAO {
    List<File> selectAll();
}
