package com.anandhita.product.repository;

import com.anandhita.product.model.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {


}
