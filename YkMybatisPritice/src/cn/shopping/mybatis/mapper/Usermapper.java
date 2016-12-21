package cn.shopping.mybatis.mapper;

import cn.shopping.mybatis.po.User;

import java.util.List;

/**
 * Created by tpusers on 2016/12/21.
 */
public interface Usermapper {
    public List<User> finduserbyusername(String username) throws Exception;
    public void insertuser(User user)throws Exception;
    public void updateuserbyid(User user)throws  Exception;
}
