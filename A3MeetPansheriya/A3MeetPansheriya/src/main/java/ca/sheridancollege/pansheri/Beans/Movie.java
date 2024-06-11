package ca.sheridancollege.pansheri.Beans;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class Movie {

private Long id;
private String name;
private String genre;
private int YearOfPublish;
}
