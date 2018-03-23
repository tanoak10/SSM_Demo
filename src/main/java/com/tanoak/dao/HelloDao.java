package com.tanoak.dao;

import com.tanoak.entity.Hello;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA
 *
 * @author tanoak
 * @date 2018/3/23
 * @desc
 */
@Repository
public interface HelloDao {

    /**
     * 根据 Id
     * @param id
     * @return
     */
    @Select("select * from hello where id =#{id}")
    Hello findById(@Param("id") String id);
}
