package com.qh.community.mapper;

import com.qh.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into USER  (NAME,ACCOUNT_ID,TOKEN,GMT_CREATE,GMT_MODIFIED) value (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified}) ")
    void insert(User user);
}
