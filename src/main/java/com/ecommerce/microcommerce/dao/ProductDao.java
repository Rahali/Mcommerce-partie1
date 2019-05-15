package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findById(int id);

    List<Product> findByPrixGreaterThan(int prixLimit);

    List<Product> findByNomLike(String recherche);

    @Query("SELECT id, nom, prix FROM Product p WHERE p.prix > :prixLimit")
    List<Product> chercherUnProduitCher(@Param("prixLimit") int prixLimit);

    @Query("SELECT p,  p.prix-p.prixAchat as marge FROM Product p ")
    int calculerMargeProduit();

    List<Product> findAllByOrderByNomAsc();
}
