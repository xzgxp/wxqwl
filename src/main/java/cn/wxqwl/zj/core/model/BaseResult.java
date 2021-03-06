package cn.wxqwl.zj.core.model;

import java.io.Serializable;

/**
 * 重写toString，打印日志的时候是对象会打印出详细信息
 * @author {jin.zhang@witontek.com}
 * @version $Id: BaseModel.java, v 0.1 2016年3月14日 下午4:12:56 {jin.zhang@witontek.com} Exp $
 */
public class BaseResult extends BaseModel implements Serializable {

    /**  */
    private static final long serialVersionUID = -8305700214273480095L;

    private String            code;

    private String            errMsg;

    private boolean           success          = false;

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>errMsg</tt>.
     * 
     * @return property value of errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Setter method for property <tt>errMsg</tt>.
     * 
     * @param errMsg value to be assigned to property errMsg
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    /**
     * Getter method for property <tt>success</tt>.
     * 
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     * 
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

}
