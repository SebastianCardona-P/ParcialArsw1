package com.example.ARSW.Controller;

import com.example.ARSW.Service.ProductService;
import com.example.ARSW.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/productos")
public class ProdcutController {

    @Autowired
    private final ProductService ps;

    public ProdcutController(ProductService ps){
        this.ps = ps;
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getAllProducts(@PathVariable("id") int id){
        try {
            return ResponseEntity.ok(ps.getById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
        }
    }

    @GetMapping()
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.ok(ps.getAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
        }
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        try {
            ps.saveProduct(product);
            return ResponseEntity.ok("Success");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
        }
    }
}
