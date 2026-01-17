package com.valber.auth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok("Acesso liberado: Lista de Produtos");
    }

    @PostMapping
    public ResponseEntity createProduct() {
        return ResponseEntity.ok("Acesso liberado: Produto Criado (ADMIN)");
    }
}