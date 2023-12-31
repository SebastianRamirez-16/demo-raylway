package com.upc.TuCine.dto;

import com.upc.TuCine.model.Film;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private Integer id;
    private String name;
    private List<Film> films;
}
