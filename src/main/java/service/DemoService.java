package service;

import dao.DemoDao;
import model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DemoService {
    @Autowired
    DemoDao demoDao;
    public int insert(String name,String password){
        Demo demo=new Demo();
        demo.setName("ahahaha");
        demo.setPassword("pafjlaskjf");
        return demoDao.insert(demo);
    }
}
