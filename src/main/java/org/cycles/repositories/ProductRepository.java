package org.cycles.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import org.cycles.entites.Product;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product>{
    /*public Uni<List<Product>> findAllByUserId(long userId){
        log.info("TRYING TO GET ALL PRODUCTS BY USER ID");
        return this.find("SELECT Product FROM Product, WishList ws WHERE ws.wishListPK.userId = ?1", userId).list();
    }*/
}
