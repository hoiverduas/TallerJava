package repositoy;

import entity.Products;

public interface IProductsRepository {
    Products getByRefID(String refID);
}
