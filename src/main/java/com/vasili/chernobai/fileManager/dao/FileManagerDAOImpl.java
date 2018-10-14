package com.vasili.chernobai.fileManager.dao;

import com.vasili.chernobai.fileManager.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class FileManagerDAOImpl implements FileManagerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<File> selectAll() {
        //TODO: set up a constant
        String sql = "SELECT * FROM file";
        return jdbcTemplate.query(sql, new RowMapper<File>() {
            @Override
            public File mapRow(ResultSet resultSet, int i) throws SQLException {
                File file = new File();
                file.setId(resultSet.getInt("id"));
                file.setName(resultSet.getString("name"));
                file.setSize(resultSet.getInt("size"));
                file.setModified(resultSet.getDate("modified"));
                file.setDirectory(resultSet.getBoolean("directory"));
                return file;
            }
        });
    }
}
