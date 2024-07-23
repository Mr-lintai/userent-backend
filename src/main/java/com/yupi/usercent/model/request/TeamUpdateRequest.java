package com.yupi.usercent.model.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户更新队伍
 * @author lintai
 * @version 1.0
 */
@Data
public class TeamUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 过期时间
     */
    private Date expireTime;


    /**
     * 0 - 公开， 1 - 私有. 2 - 加密
     */
    private Integer status;

    /**
     * 密码
     */
    private String password;


    private static final long serialVersionUID = 1L;

}
