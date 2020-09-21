package com.wxit.gmall.user.service.impl;

import com.wxit.gmall.user.bean.UmsMember;
import com.wxit.gmall.user.bean.UmsMemberReceiveAddress;
import com.wxit.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.wxit.gmall.user.mapper.UserMapper;
import com.wxit.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author : wj
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAll(); //userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> UmsMemberReceiveAddress(String memberId) {

        Example e = new Example(UmsMemberReceiveAddress.class);

        e.createCriteria().andEqualTo("memberId",memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);
        return umsMemberReceiveAddresses;
    }
}
