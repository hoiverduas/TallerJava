package repositoy;

import entity.Products;

import java.util.Map;

public class ProductsRepository implements IProductsRepository {

    Map<String, Products> productssDB = Map.of(
            "01", new Products("01","Paracetamol", 2000,50 ),
            "02", new Products("02","Ibuprofeno", 2500, 40),
            "03", new Products("03","Vitaminas", 3000, 30),
            "04", new Products("04","Antiseptico", 5000, 20),
            "05", new Products("05","Amoxicilina", 1500, 10)
    );




    @Override
    public Products getByRefID(String refID) {
        return productssDB.get(refID);
    }
}
