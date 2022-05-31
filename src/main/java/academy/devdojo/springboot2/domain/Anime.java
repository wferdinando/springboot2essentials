package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data //GET AND SETTER
@ToString // TO_STRING
@AllArgsConstructor // CONSTRUCTORS
public class Anime {
	
	private Long id;
	private String name;

}
