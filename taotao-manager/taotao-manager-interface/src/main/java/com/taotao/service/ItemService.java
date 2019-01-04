package com.taotao.service;


import com.taotao.common.pojo.EasyUIDataGridResult;

/**
* @Description:    商品相关处理的service
* @Author:         AHUAN
* @CreateDate:     2019/1/3 0003 下午 8:09
* @UpdateUser:     AHUAN
* @UpdateDate:     2019/1/3 0003 下午 8:09
* @content:        内容
* <p>localhost:ahuan.com</p>
* @Version:        1.0
*/
public interface ItemService {
    public EasyUIDataGridResult getItemList(Integer page, Integer rows);
}