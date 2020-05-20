package com.pinfan.project.work.api.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pinfan.framework.aspectj.lang.annotation.Excel;
import com.pinfan.framework.web.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Accessors(chain = true)
@TableName("wx_user")
public class WXUser extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    @Excel(name = "用户的openid")
    private String openid ;

    @Excel(name = "邀请人openid ")
    private String father_openid  ;

    @Excel(name = "用户昵称 ")
    private String nickname  ;
    @Excel(name = "用户昵称 ")
    private String 用户头像   ;
    @Excel(name = "性别 0-男、1-女 ")
    private String gender    ;
    @Excel(name = "用户账号 ")
    private String userName ;

    private String password;
}
