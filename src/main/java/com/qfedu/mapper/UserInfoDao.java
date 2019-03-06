package com.qfedu.mapper;

import com.qfedu.domain.UserInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {

    @Select({"select * from userInfo where username =#{username}"})
    public UserInfo selectUserInfoByUsername(String username) throws Exception;
}
