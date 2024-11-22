package ee.ivkhk.SpringBootTest.helpers;

import ee.ivkhk.SpringBootTest.entities.Product;
import ee.ivkhk.SpringBootTest.interfaces.AppHelper;
import org.springframework.stereotype.Component;

@Component
public class ProductAppHelper implements AppHelper<Product> {

    @Override
    public Product create() {
        return null;
    }
}
