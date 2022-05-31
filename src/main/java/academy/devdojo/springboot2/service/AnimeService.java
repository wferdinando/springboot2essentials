package academy.devdojo.springboot2.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import academy.devdojo.springboot2.domain.Anime;

@Service
public class AnimeService {

	private List<Anime> animes = List.of(new Anime(1L, "Boku No Hero"), new Anime(2L, "Berserk"));

	// private final AnimeRepository animeRepository

	public List<Anime> listAll() {
		return animes;
	}

	public Anime findById(long id) {
		return animes.stream().filter(anime -> anime.getId().equals(id)).findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
	}

}