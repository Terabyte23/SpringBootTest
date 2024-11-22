package ee.ivkhk.SpringBootTest.services;

import ee.ivkhk.SpringBootTest.interfaces.AppService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements AppService {
    @Override
    public boolean add(){
        return false;
    }
}
