package dao;

import mapper.DemoMapper;
import model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {
    @Autowired(required = false)  DemoMapper demoMapper;
    public int insert(Demo demo){
        return demoMapper.insert(demo);
    }
}
