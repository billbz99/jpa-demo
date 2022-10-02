package io.jpabuddy.spring.demo.jpademo.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link io.jpabuddy.spring.demo.jpademo.entities.Brand} entity
 */
public class BrandDto implements Serializable {
    private final Integer id;
    @Size(max = 255)
    @NotNull
    private final String brandName;

    public BrandDto(Integer id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public Integer getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandDto entity = (BrandDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.brandName, entity.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "brandName = " + brandName + ")";
    }
}