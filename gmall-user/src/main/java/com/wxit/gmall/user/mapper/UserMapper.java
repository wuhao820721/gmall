package com.wxit.gmall.user.mapper;

import com.wxit.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author : wj
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
