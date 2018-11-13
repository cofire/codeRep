package com.cofire.service;

import java.util.List;

import com.cofire.dao.domain.Visitor;

public interface IVisitorService {

    /**
     * 当日访客信息查询分页
     * 
     * @Title: selectVisitorByDayPage
     * @author Yjb
     * @Description:
     * @param idCard
     * @param name
     * @param idType
     * @return
     * @throws Exception
     * @return Visitor 返回类型
     */
    List<Visitor> selectVisitorByDayPage(Visitor p_visitor, Integer p_pageNo, Integer p_pageSize) throws Exception;

    /**
     * 当日访客信息查询
     * 
     * @Title: selectVisitorByDay
     * @author Yjb
     * @Description:
     * @param idCard
     * @param name
     * @param idType
     * @return
     * @throws Exception
     * @return Visitor 返回类型
     */
    List<Visitor> selectVisitorByDay(Visitor p_visitor) throws Exception;

    /**
     * 历史访客信息查询分页
     * 
     * @Title: selectVisitorByHistoryPage
     * @author Yjb
     * @Description:
     * @param idCard
     * @param name
     * @param idType
     * @return
     * @throws Exception
     * @return Visitor 返回类型
     */
    List<Visitor> selectVisitorByHistoryPage(Visitor p_visitor, Integer p_pageNo, Integer p_pageSize) throws Exception;

    /**
     * 当日访客信息查询
     * 
     * @Title: selectVisitorByHistory
     * @author Yjb
     * @Description:
     * @param idCard
     * @param name
     * @param idType
     * @return
     * @throws Exception
     * @return Visitor 返回类型
     */
    List<Visitor> selectVisitorByHistory(Visitor p_visitor) throws Exception;

    /**
     * 单条访客信息查询
     * 
     * @Title: selectVisitorByDid
     * @author Yjb
     * @Description:
     * @param d_id
     * @return
     * @throws Exception
     * @return Visitor 返回类型
     */
    Visitor selectByPrimaryKey(String p_dId) throws Exception;

    /**
     * 普通访客信息入表
     * 
     * @Title: addVisotor
     * @author ly
     * @Description:
     * @param p_visitor
     * @return
     * @throws Exception
     * @return Integer 返回类型
     */
    int addVisotor(Visitor p_visitor) throws Exception;

    /**
     * 访客记录表
     * 
     * @Title:issueAccessCard
     * @author mc
     * @Description:
     * @param p_visitor
     * @return
     * @throws Exception
     * @return Integer 返回类型
     */
    int issueAccessCard(Visitor p_visitor) throws Exception;

    /**
     * 访客记录表
     * 
     * @Title: visitorleaving
     * @author mc
     * @Description:
     * @param p_visitor
     * @return
     * @throws Exception
     * @return Integer 返回类型
     */
    int visitorleaving(Visitor p_visitor) throws Exception;

    /**
     * 
     * @Title: updateVisitor
     * @author ly
     * @Description:更新访客信息表
     * @param p_visitor
     * @return
     * @throws Exception
     * @return int 返回类型
     */
    int updateVisitor(Visitor p_visitor) throws Exception;

    /**
     * 
     * @Title: deleteByPrimaryKey
     * @author yjb
     * @Description:删除访客信息表
     * @param dId
     * @return
     * @throws Exception
     * @return int 返回类型
     */
    int deleteByPrimaryKey(String dId) throws Exception;

    /**
     * 
     * @Title: getVisitorById
     * @author ly
     * @Description:通过id查询访客信息
     * @param p_id
     * @return
     * @throws Exception
     * @return Visitor 返回类型
     */
    Visitor getVisitorById(String p_id) throws Exception;

}
