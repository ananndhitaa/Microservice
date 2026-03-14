package com.anandhita.product.service;

import org.springframework.stereotype.Service;
import com.anandhita.product.model.Pelanggan;
import com.anandhita.product.repository.PelangganRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class PelangganService {

@Autowired
private PelangganRepository pelangganRepository;

public List<Pelanggan> getAllPelanggan() {
    return pelangganRepository.findAll();
}

public Pelanggan createPelanggan(Pelanggan pelanggan) {
    return pelangganRepository.save(pelanggan);

}
public Pelanggan getPelangganById(Long id) {
    return pelangganRepository.findById(id).orElse(null);
}

public void deletePelanggan(Long id) {
    pelangganRepository.deleteById(id);
}
}
