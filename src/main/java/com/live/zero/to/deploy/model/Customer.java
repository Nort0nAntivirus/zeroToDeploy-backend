package com.live.zero.to.deploy.model;

import com.live.zero.to.deploy.core.BaseModel;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer extends BaseModel {

    @Size(max = 255)
    @NotBlank
    @NotNull
    private String name;

    @PositiveOrZero
    @NotNull
    private Integer age;
}
