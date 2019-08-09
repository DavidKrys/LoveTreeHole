package group.lovelymen.dao;

import group.lovelymen.entity.UserLover;

public interface UserLoverMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLover record);

    int insertSelective(UserLover record);

    UserLover selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLover record);

    int updateByPrimaryKey(UserLover record);
}