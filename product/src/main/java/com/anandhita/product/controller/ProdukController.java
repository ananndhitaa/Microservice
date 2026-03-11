package com.anandhita.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;   
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anandhita.product.model.Produk;
import com.anandhita.product.service.ProdukService;
import java.util.List;



@RestController
@RequestMapping("/api/produk")
public class ProdukController {
    @Autowired
    private ProdukService produkService;

    @GetMapping
    public List<Produk> getAllProduk() {
        return produkService.getAllProduk();

}

@GetMapping("/{id}")
public ResponseEntity<Produk> getProdukById(@PathVariable Long id) {
    Produk produk = produkService.getProdukById(id);
    return produk != null ? ResponseEntity.ok(produk) : ResponseEntity.notFound().build();

}

@PostMapping
public ResponseEntity<Produk> createProduk(@RequestBody Produk produk) {
    Produk createdProduk = produkService.createProduk(produk);
    return ResponseEntity.ok(createdProduk);
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteProduk(@PathVariable Long id) {
    produkService.deleteProduk(id);
    return ResponseEntity.noContent().build();  
}


}