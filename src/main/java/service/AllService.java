package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllService {
    @Autowired DemoService demoService;

    public DemoService getDemoService() {
        return demoService;
    }
}
