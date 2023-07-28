package com.lizza.service;

import com.lizza.dao.goods.GoodsDao;
import com.lizza.entity.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-14
 */
@Service
public class GoodsService {

    @Resource
    private GoodsDao goodsDao;

    public Goods select(int id) {
        return goodsDao.select(id);
    }
}
