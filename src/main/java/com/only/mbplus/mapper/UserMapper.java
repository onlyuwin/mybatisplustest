package com.only.mbplus.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.only.mbplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
