package io.jpabuddy.spring.demo.jpademo.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link io.jpabuddy.spring.demo.jpademo.entities.Product} entity
 */
public class ProductDto implements Serializable {
    private final Integer id;
    @Size(max = 255)
    @NotNull
    private final String productName;
    @NotNull
    private final BrandDto brand;

    public ProductDto(Integer id, String productName, BrandDto brand) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public BrandDto getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto entity = (ProductDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.productName, entity.productName) &&
                Objects.equals(this.brand, entity.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, brand);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "productName = " + productName + ", " +
                "brand = " + brand + ")";
    }
}