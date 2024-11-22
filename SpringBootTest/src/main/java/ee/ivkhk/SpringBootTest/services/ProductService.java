package ee.ivkhk.SpringBootTest.services;

import ee.ivkhk.SpringBootTest.entities.Product;
import ee.ivkhk.SpringBootTest.interfaces.AppHelper;
import ee.ivkhk.SpringBootTest.interfaces.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements AppService {
    private final AppHelper<Product> productAppHelper;

    @Autowired
    public ProductService(AppHelper<Product> productAppHelper){
        this.productAppHelper = productAppHelper;
    }
    @Override
    public boolean add(){
        Product product = productAppHelper.create();
        if(product == null){return false;}
        return true;
    }
}
