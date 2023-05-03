package com.schen.demo_java17.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName demo
 */
@TableName(value ="demo")
public class Demo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String auth;

    /**
     * 
     */
    private Integer parentid;

    /**
     * 
     */
    private String role;

    /**
     * 
     */
    private Integer states;

    /**
     * 
     */
    private Date createdtime;

    /**
     * 
     */
    private Date updatedtime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getAuth() {
        return auth;
    }

    /**
     * 
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }

    /**
     * 
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 
     */
    public String getRole() {
        return role;
    }

    /**
     * 
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 
     */
    public Integer getStates() {
        return states;
    }

    /**
     * 
     */
    public void setStates(Integer states) {
        this.states = states;
    }

    /**
     * 
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * 
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * 
     */
    public Date getUpdatedtime() {
        return updatedtime;
    }

    /**
     * 
     */
    public void setUpdatedtime(Date updatedtime) {
        this.updatedtime = updatedtime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Demo other = (Demo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAuth() == null ? other.getAuth() == null : this.getAuth().equals(other.getAuth()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getStates() == null ? other.getStates() == null : this.getStates().equals(other.getStates()))
            && (this.getCreatedtime() == null ? other.getCreatedtime() == null : this.getCreatedtime().equals(other.getCreatedtime()))
            && (this.getUpdatedtime() == null ? other.getUpdatedtime() == null : this.getUpdatedtime().equals(other.getUpdatedtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAuth() == null) ? 0 : getAuth().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getStates() == null) ? 0 : getStates().hashCode());
        result = prime * result + ((getCreatedtime() == null) ? 0 : getCreatedtime().hashCode());
        result = prime * result + ((getUpdatedtime() == null) ? 0 : getUpdatedtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", auth=").append(auth);
        sb.append(", parentid=").append(parentid);
        sb.append(", role=").append(role);
        sb.append(", states=").append(states);
        sb.append(", createdtime=").append(createdtime);
        sb.append(", updatedtime=").append(updatedtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}