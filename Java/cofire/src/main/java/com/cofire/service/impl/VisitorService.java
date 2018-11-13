package com.cofire.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cofire.dao.domain.Visitor;
import com.cofire.dao.domain.VisitorExample;
import com.cofire.dao.mapper.VisitorMapper;
import com.cofire.service.IVisitorService;
import com.cofire.util.CommonUtils;
import com.cofire.util.DateUtils;

@Service
public class VisitorService implements IVisitorService {

    @Autowired
    private VisitorMapper c_visitorMapper;

    @Override
    public List<Visitor> selectVisitorByDayPage(Visitor p_visitor, Integer p_pageNo, Integer p_pageSize) throws Exception {
        VisitorExample m_example = new VisitorExample();
        VisitorExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty((p_visitor.getIdCard()))) {
            m_criteria.andIdCardEqualTo(p_visitor.getIdCard());
        }
        if (StringUtils.isNotEmpty((p_visitor.getName()))) {
            m_criteria.andNameEqualTo(p_visitor.getName());
        }
        if (StringUtils.isNotEmpty((p_visitor.getStatus()))) {
            m_criteria.andStatusEqualTo(p_visitor.getStatus());
        }
        m_example.setLimitStart((p_pageNo - 1) * p_pageSize);
        m_example.setLimitSize(p_pageSize);
        m_criteria.andCreateTimeBetween(DateUtils.dataTimeToNumber(CommonUtils.getStartTime()), DateUtils.dataTimeToNumber(CommonUtils.getnowEndTime()));
        List<Visitor> m_visitorList = c_visitorMapper.selectByExample(m_example);
        return m_visitorList;
    }

    @Override
    public List<Visitor> selectVisitorByHistoryPage(Visitor p_visitor, Integer p_pageNo, Integer p_pageSize) throws Exception {
        VisitorExample m_example = new VisitorExample();
        VisitorExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty((p_visitor.getIdCard()))) {
            m_criteria.andIdCardEqualTo(p_visitor.getIdCard());
        }
        if (StringUtils.isNotEmpty((p_visitor.getName()))) {
            m_criteria.andNameEqualTo(p_visitor.getName());
        }
        if (StringUtils.isNotEmpty((p_visitor.getVisitorType()))) {
            m_criteria.andVisitorTypeEqualTo(p_visitor.getVisitorType());
        }
        if (StringUtils.isNotEmpty((p_visitor.getCreateTime()))) {
            m_criteria.andCreateTimeBetween(p_visitor.getCreateTime(),
                    DateUtils.dateToNumber(CommonUtils.getDateAddOne(DateUtils.numberToDate(p_visitor.getCreateTime()))));
        }
        if (StringUtils.isNotEmpty((p_visitor.getOutTime()))) {
            m_criteria.andOutTimeBetween(p_visitor.getOutTime(),
                    DateUtils.dateToNumber(CommonUtils.getDateAddOne(DateUtils.numberToDate(p_visitor.getOutTime()))));
        }
        m_example.setLimitStart((p_pageNo - 1) * p_pageSize);
        m_example.setLimitSize(p_pageSize);
        List<Visitor> m_visitorList = c_visitorMapper.selectByExample(m_example);
        return m_visitorList;
    }

    @Override
    public Visitor selectByPrimaryKey(String p_dId) throws Exception {
        if (StringUtils.isEmpty(p_dId)) {
            return null;
        }
        Visitor m_visitor = c_visitorMapper.selectByPrimaryKey(p_dId);
        return m_visitor;
    }

    @Override
    public int addVisotor(Visitor p_visitor) throws Exception {
        int m_res = c_visitorMapper.insertSelective(p_visitor);
        return m_res;
    }

    @Override
    public int issueAccessCard(Visitor p_visitor) throws Exception {
        p_visitor.setInTime(DateUtils.dataTimeToNumber(new Date()));
        int m_res = c_visitorMapper.updateByPrimaryKeySelective(p_visitor);
        return m_res;
    }

    @Override
    public int updateVisitor(Visitor p_visitor) throws Exception {
        int m_res = c_visitorMapper.updateByPrimaryKeySelective(p_visitor);
        return m_res;
    }

    @Override
    public Visitor getVisitorById(String p_id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int visitorleaving(Visitor p_visitor) throws Exception {
        p_visitor.setOutTime(DateUtils.dataTimeToNumber(new Date()));
        int m_res = c_visitorMapper.updateByPrimaryKeySelective(p_visitor);
        return m_res;
    }

    @Override
    public List<Visitor> selectVisitorByDay(Visitor p_visitor) throws Exception {
        VisitorExample m_example = new VisitorExample();
        VisitorExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty((p_visitor.getIdCard()))) {
            m_criteria.andIdCardEqualTo(p_visitor.getIdCard());
        }
        if (StringUtils.isNotEmpty((p_visitor.getName()))) {
            m_criteria.andNameEqualTo(p_visitor.getName());
        }
        if (StringUtils.isNotEmpty((p_visitor.getStatus()))) {
            m_criteria.andStatusEqualTo(p_visitor.getStatus());
        }
        m_criteria.andCreateTimeBetween(DateUtils.dataTimeToNumber(CommonUtils.getStartTime()), DateUtils.dataTimeToNumber(CommonUtils.getnowEndTime()));
        List<Visitor> m_visitorList = c_visitorMapper.selectByExample(m_example);
        return m_visitorList;
    }

    @Override
    public List<Visitor> selectVisitorByHistory(Visitor p_visitor) throws Exception {
        VisitorExample m_example = new VisitorExample();
        VisitorExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty((p_visitor.getIdCard()))) {
            m_criteria.andIdCardEqualTo(p_visitor.getIdCard());
        }
        if (StringUtils.isNotEmpty((p_visitor.getName()))) {
            m_criteria.andNameEqualTo(p_visitor.getName());
        }
        if (StringUtils.isNotEmpty((p_visitor.getVisitorType()))) {
            m_criteria.andVisitorTypeEqualTo(p_visitor.getVisitorType());
        }
        if (StringUtils.isNotEmpty((p_visitor.getCreateTime()))) {
            m_criteria.andCreateTimeBetween(p_visitor.getCreateTime(),
                    DateUtils.dateToNumber(CommonUtils.getDateAddOne(DateUtils.numberToDate(p_visitor.getCreateTime()))));
        }
        if (StringUtils.isNotEmpty((p_visitor.getOutTime()))) {
            m_criteria.andOutTimeBetween(p_visitor.getOutTime(),
                    DateUtils.dateToNumber(CommonUtils.getDateAddOne(DateUtils.numberToDate(p_visitor.getOutTime()))));
        }
        List<Visitor> m_visitorList = c_visitorMapper.selectByExample(m_example);
        return m_visitorList;
    }

    @Override
    public int deleteByPrimaryKey(String p_dId) throws Exception {
        String[] ids = p_dId.split(",");
        int m_res = 0;
        for (String id : ids) {
            m_res = c_visitorMapper.deleteByPrimaryKey(id);
        }
        return m_res;
    }

}
