package com.offi.service.serviceImpl;

import com.offi.dao.ContactDao;
import com.offi.dao.DaoImpl.ContactDaoImpl;
import com.offi.entity.ContactEntity;
import com.offi.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ContactService接口的实现类
 */
@Service
public class ContactServiceImpl implements ContactService {
    /**
     * 添加联系人
     * @param name
     * @param tel
     * @param phone
     * @param qq
     * @return
     */
    @Autowired
    private ContactDao  contactDao;
    public int addContact(String name,String tel,String phone,String qq){
        return contactDao.addContact(name,tel,phone,qq);
    }

    /**
     * 显示全部联系人
     * @return 联系人实体类列表
     */
    public List<ContactEntity> showContactList(){
        return new ArrayList<ContactEntity>();
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
