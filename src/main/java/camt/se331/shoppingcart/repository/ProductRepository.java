package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by non on 3/25/2016.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {

            }
