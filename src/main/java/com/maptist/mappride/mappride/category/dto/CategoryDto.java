package com.maptist.mappride.mappride.category.dto;

import com.maptist.mappride.mappride.category.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CategoryDto {
    private String name;
    private boolean publish;

    public Category toCategory() {
        return Category.builder()
                .name(name)
                .publish(publish)
                .build();
    }


}

