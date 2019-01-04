package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        //设置分页信息
        if (page==null || page == 0) page=1;
        if (rows==null || rows == 0) rows=30;
        PageHelper.startPage(page,rows);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> tbItems = tbItemMapper.selectByExample(example);
        //获取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItems);

        //封装进POJO
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal((int) pageInfo.getTotal());
        result.setRows(tbItems);
        return result;
    }
}
