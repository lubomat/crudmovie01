package pl.crudmovie.movielibrary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private int id;
    private String name;
    private int rating;
}
