package com.wxit.gmall.user.service;

import com.wxit.gmall.user.bean.UmsMember;
import com.wxit.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author : wj
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> UmsMemberReceiveAddress(String memberId);
}
