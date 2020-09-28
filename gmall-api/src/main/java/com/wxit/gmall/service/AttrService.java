package com.wxit.gmall.service;

import com.wxit.gmall.bean.PmsBaseAttrInfo;
import com.wxit.gmall.bean.PmsBaseAttrValue;
import com.wxit.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

/**
 * @author : wj
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
