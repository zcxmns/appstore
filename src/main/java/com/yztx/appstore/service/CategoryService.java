package com.yztx.appstore.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by aw on 2017/8/30.
 * 栏目相关service
 */
@Service
public class CategoryService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 获取应用分类列表
     * id --栏目id
     * @return
     */
    public List<Map<String,Object>> getCategoryList(String id){
        StringBuffer sql = new StringBuffer("SELECT c.fd_name, c.fd_display, c.fd_createTime, c.fd_id, c.fd_logo, c.fd_pid, c.fd_sort, c.fd_updateTime FROM db_appstore_category c ");
        if (StringUtils.isNotBlank(id)){
            sql.append(" where c.fd_pid="+id);
        }
        sql.append(" order by c.fd_sort ");
        return jdbcTemplate.queryForList(sql.toString());
    }

}
