package com.cofire.common;

import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 存放当前登录用户的Map
 * @Author
 * @Date
 */
public class CurrentLoginUserMap {
    private static final Logger logger = LoggerFactory.getLogger(CurrentLoginUserMap.class);
    /** 存放当前登录用户的所有映射 */
    public static ConcurrentHashMap<String, HttpSession> currentLoginMap = new ConcurrentHashMap<String, HttpSession>();

    /**
     * 检查当前请求登录的session是否在currentLoginMap中存在，并进行相关操作
     * 
     * @param subscriberId
     * @param requestSession
     */
    public static void checkCurrentLoginUser(String subscriberId, HttpSession requestSession) {
        // 检查currentLoginMap是否已包含当前请求登录用户
        if (!currentLoginMap.containsKey(subscriberId)) {
            // 不存在，则将当前请求相关信息加入Map
            currentLoginMap.put(subscriberId, requestSession);
        } else {
            // 获取Map中存储的session
            HttpSession currentSession = currentLoginMap.get(subscriberId);

            // 移除之前的记录
            currentLoginMap.remove(subscriberId);
            // 加入当前请求的session
            currentLoginMap.put(subscriberId, requestSession);

            // 销毁之前的Session(排除以下情况:1、用户未注销的情况下，进行登录；2、Session自动失效，不销毁)
            try {
                if (null != currentSession && !currentSession.equals(requestSession)) {
                    logger.info("前一个登录用户ID:" + subscriberId + "对应的SessionID:" + currentSession.getId() + "被销毁，当前登录用户的SessionID为:" + requestSession.getId());
                    currentSession.invalidate();
                }
            } catch (IllegalStateException e) {
                // session已经自动生效，不做任何操作
                logger.info("用户ID:" + subscriberId + "对应的SessionID:" + currentSession.getId() + "自动失效");
            }
        }
    }
}
