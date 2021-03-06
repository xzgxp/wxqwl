package cn.wxqwl.zj.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import cn.wxqwl.zj.core.model.dto.UserInfo;
import cn.wxqwl.zj.web.utils.SessionUtil;

public class SessionFilter implements Filter {

    /**  */
    private static final Logger logger      = LoggerFactory.getLogger(SessionFilter.class);

    private static final String SESSION_UID = "session_uid";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("session filter init....");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                                                                                             throws IOException,
                                                                                             ServletException {
        logger.info("session filter doFilter....");

        try {
            HttpServletRequest req = (HttpServletRequest) request;
            UserInfo userInfo = SessionUtil.getUser(req);
            String _uid = SessionUtil.getUid(req);
            logger.info("session filter userInfo=" + userInfo + "_uid=" + _uid + "sessionId="
                        + req.getSession().getId());
            if (StringUtils.isNotEmpty(_uid)) {
                OperationContex.setUid(_uid);
                // 记录日志作用
                MDC.put(SESSION_UID, _uid);
            }
            if (userInfo != null) {
                OperationContex.setCurrentuserinfo(userInfo);
            }

            chain.doFilter(request, response);
        } catch (Exception e) {
            logger.error("session filter exception ...", e);
        } finally {
            logger.info("session filter finally....");
            //防止内存泄漏
            OperationContex.remove();
            MDC.remove(SESSION_UID);
        }

    }

    @Override
    public void destroy() {
        logger.info("session filter destory....");

    }

}
