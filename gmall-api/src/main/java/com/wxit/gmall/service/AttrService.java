package com.wxit.gmall.service;

import com.wxit.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author : wj
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
