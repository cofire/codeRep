package com.merck.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merck.common.Result;
import com.merck.dao.domain.Data;
import com.merck.service.impl.DataServiceImpl;

@Controller
public class DataController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(DataController.class);

    @Autowired
    private DataServiceImpl c_dataServiceImpl;

    @RequestMapping("/visitor")
    public String visitor() {
        return "visitor";
    }

    @RequestMapping("/getDatas")
    @ResponseBody
    public Result<?> getDatas(Data data) throws Exception {
        logger.info("获取data：" + new Date());
        Result<Data> rs = new Result<>();
        try {
            List<Data> datas = c_dataServiceImpl.qryDatas(data);
            rs.setDataList(datas);
            rs.setTotal(datas.size());
            rs.setSuccess(true);
            if (rs.getDataList().size() > 0) {
                // retMessage = "查询成功";
            } else {
                rs.setRetMessage("查询无记录");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            rs.setRetMessage("查询数据失败-服务器异常");
            rs.setSuccess(false);
        }
        return rs;
    }

    @RequestMapping("/addData")
    @ResponseBody
    public Result<?> addData(Data data) throws Exception {
        logger.info("保存访客记录：" + data.toString());
        Result<?> rs = null;
        try {
            rs = c_dataServiceImpl.addData(data);
        } catch (Exception e) {
            rs.setRetMessage("修改密码失败-服务器异常");
            rs.setSuccess(false);
            logger.error(e.getMessage(), e);
        }
        return rs;
    }
}
