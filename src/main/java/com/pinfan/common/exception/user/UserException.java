package com.pinfan.common.exception.user;

import com.pinfan.common.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author pinfan
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
