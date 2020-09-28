package com.wxit.gmall.service;

import com.wxit.gmall.bean.PmsProductInfo;

import java.util.List;

/**
 * @author : wj
 */
public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
