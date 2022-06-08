package com.example.t2008mrestfulwebservice.ressource;

import com.example.t2008mrestfulwebservice.entity.Product;
import com.example.t2008mrestfulwebservice.model.InMemoryProductModel;
import com.example.t2008mrestfulwebservice.model.ProductModel;

import javax.ws.rs.*;
import java.util.List;

@Path("/products")
@Produces("application/json")
@Consumes("application/json")
public class ProductResource {
    ProductModel productModel;

    public  ProductResource(){
        productModel = new InMemoryProductModel();
    }

    @GET
    public List<Product> fillAll(){
        return productModel.findAll();
    }

    @GET
    @Path("{id}")
    public Product findById(@PathParam("id") int id){
        return productModel.findById(id);
    }

    @POST
    public boolean create(Product product){
        return productModel.save(product);
    }

    @PUT
    @Path("{id}")
    public boolean update(@PathParam("id") int id, Product updateProduct){
        return productModel.update(updateProduct, id);
    }

    @DELETE
    @Path("{id}")
    public boolean delete(@PathParam("id") int id){
        return productModel.delete(id);
    }
}