package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by non on 3/28/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

    }

