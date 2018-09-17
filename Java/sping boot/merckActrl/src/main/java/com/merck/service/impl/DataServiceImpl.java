package com.merck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merck.common.Result;
import com.merck.dao.domain.Data;
import com.merck.dao.domain.DataExample;
import com.merck.dao.mapper.DataMapper;
import com.merck.service.IDataService;

@Service
public class DataServiceImpl implements IDataService {

    @Autowired
    private DataMapper c_dataMapper;

    public List<Data> qryDatas(Data data) throws Exception {
        DataExample example = new DataExample();
        return c_dataMapper.selectByExample(example);
    }

    @Override
    public Result<?> addData(Data data) throws Exception {
        Result<?> rs = new Result<>();
        int ret = -1;
        ret = c_dataMapper.insertSelective(data);
        if (ret > 0) {
            rs.setRetMessage("保存成功！");
            rs.setSuccess(true);
        } else {
            rs.setRetMessage("保存失败！");
            rs.setSuccess(false);
        }
        return rs;
    }

}
