package group.lovelymen.dao;

import group.lovelymen.entity.UserDetails;

public interface UserDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDetails record);

    int insertSelective(UserDetails record);

    UserDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDetails record);

    int updateByPrimaryKey(UserDetails record);
}