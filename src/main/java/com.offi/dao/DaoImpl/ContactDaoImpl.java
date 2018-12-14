package com.offi.dao.DaoImpl;

import com.offi.dao.ContactDao;
import com.offi.entity.ContactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ContactDao 接口实现类
 */
@Repository
public class ContactDaoImpl implements ContactDao {
    /**
     *  在Spring的配置文件applicationContext.xml中注入了sessionFactory
     */
    private HibernateTemplate hibernateTemplate;


    /**
     * 添加联系人
     * @param name
     * @param tel
     * @param phone
     * @param qq
     * @return
     */
    public int addContact(String name,String tel,String phone,String qq){
        ContactEntity contactEntity = new ContactEntity(name,tel,phone,qq);
        hibernateTemplate.save(contactEntity);
        return 1;
    }

    /**
     * 显示全部联系人
     * @return 联系人实体类列表
     */
    public List<ContactEntity> showContactList(){
        List<ContactEntity> contactList = new ArrayList<ContactEntity>();

        return contactList;
    }

    /**
     * 通过id删除联系人
     * @param id
     * @return
     */
    public int delContactById(int id){
        return 1;
    }
}
