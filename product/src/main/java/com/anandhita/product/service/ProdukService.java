package com.anandhita.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anandhita.product.model.Produk;  
import com.anandhita.product.repository.ProdukRepository;
import java.util.List;

@Service

public class ProdukService {
    @Autowired
    private ProdukRepository produkRepository;

    public List<Produk> getAllProduk() {
        return produkRepository.findAll();
    }

    public Produk getProdukById(Long id) {
        return produkRepository.findById(id).orElse(null);
    }

    public Produk createProduk(Produk produk) {
        return produkRepository.save(produk);
    }            

    public void deleteProduk(Long id) {
        produkRepository.deleteById(id);
    }

}
