package com.wxit.gmall.mange.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wxit.gmall.bean.PmsBaseAttrInfo;
import com.wxit.gmall.mange.mapper.PmsBaseAttrInfoMapper;
import com.wxit.gmall.mange.mapper.PmsBaseAttrValueMapper;
import com.wxit.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : wj
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }
}