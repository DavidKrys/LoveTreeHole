package group.lovelymen.dao;

import group.lovelymen.entity.UserLoveMessage;

public interface UserLoveMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLoveMessage record);

    int insertSelective(UserLoveMessage record);

    UserLoveMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoveMessage record);

    int updateByPrimaryKey(UserLoveMessage record);
}