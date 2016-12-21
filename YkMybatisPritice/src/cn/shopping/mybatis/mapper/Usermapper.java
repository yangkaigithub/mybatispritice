package cn.shopping.mybatis.mapper;

import cn.shopping.mybatis.po.User;

/**
 * Created by tpusers on 2016/12/21.
 */
public interface Usermapper {
    public User finduserbyusername(String username) throws Exception;
}
