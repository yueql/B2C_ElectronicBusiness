package shiro.dao;

import shiro.entity.userInfo;

public interface userInfoDao {
    public userInfo getUserBaseInfo(int userid);
    public int editUserBaseInfo(userInfo u);
    public int addUserBaseInfo(userInfo u);
}
