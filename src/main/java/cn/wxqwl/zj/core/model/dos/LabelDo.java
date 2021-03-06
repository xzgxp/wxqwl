package cn.wxqwl.zj.core.model.dos;

import java.util.Date;

import cn.wxqwl.zj.core.model.BaseModel;

public class LabelDo extends BaseModel {

    /**  */
    private static final long serialVersionUID = 3063368597285664042L;

    private long id;

    private String name;

    private String status;

    private Date gmtCreate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

}
