package com.wxit.gmall.service;

import com.wxit.gmall.bean.UmsMember;
import com.wxit.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author : wj
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> UmsMemberReceiveAddress(String memberId);
}
