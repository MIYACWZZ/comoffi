package com.offi.dao;

import com.offi.entity.ContactEntity;

import java.util.List;

/**
 * 联系人 Dao 层
 */
public interface ContactDao {
    /**
     * 添加联系人
     * @param name
     * @param tel
     * @param phone
     * @param qq
     * @return
     */
    public int addContact(String name,String tel,String phone,String qq);

    /**
     * 显示全部联系人
     * @return 联系人实体类列表
     */
    public List<ContactEntity> showContactList();

    /**
     * 通过id删除联系人
     * @param id
     * @return
     */
    public int delContactById(int id);
}
