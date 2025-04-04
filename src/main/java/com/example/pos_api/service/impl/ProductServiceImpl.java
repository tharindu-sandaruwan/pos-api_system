package com.example.pos_api.service.impl;

import com.cloudinary.Cloudinary;
import com.example.pos_api.controller.requestDTO.OrderRequestDTO;
import com.example.pos_api.controller.requestDTO.ProductRequestDTO;
import com.example.pos_api.model.Product;
import com.example.pos_api.repository.ProductRepository;
import com.example.pos_api.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private Cloudinary cloudinary;


    @Override
    public Product create(ProductRequestDTO productRequestDTO)throws IOException {

        Product product = new Product();
        product.setName(productRequestDTO.getName());
        product.setPrice(productRequestDTO.getPrice());
        product.setCategory(productRequestDTO.getCategory());
        product.setDescription(productRequestDTO.getDescription());
        product.setStock(productRequestDTO.getStock());


        String image = cloudinary.uploader()
                .upload(productRequestDTO.getImageUrl().getBytes(),
                        Map.of("public_id", UUID.randomUUID().toString()))
                .get("url")
                .toString();

        product.setImageUrl(image);
        productRepository.save(product);

        productRepository.save(product);
        return product;

    }

    @Override
    public List<Product> findAll() {
        List <Product> productList =productRepository.findAll();
        return productList;
    }

    @Override
    public Product updateById(Long productId, ProductRequestDTO productRequestDTO)  {

        Optional<Product> productOptional = productRepository.findById(productId);

        if(!productOptional.isPresent()){
            System.out.println("Product not found");
        }
        Product product = productOptional.get();
        product.setName(productRequestDTO.getName());
        product.setPrice(productRequestDTO.getPrice());
        product.setCategory(productRequestDTO.getCategory());
        product.setDescription(productRequestDTO.getDescription());
        product.setStock(productRequestDTO.getStock());





        return productRepository.save(product);
    }

    @Override
    public void deleteById(Long productId) {

        productRepository.deleteById(productId);

    }
}
