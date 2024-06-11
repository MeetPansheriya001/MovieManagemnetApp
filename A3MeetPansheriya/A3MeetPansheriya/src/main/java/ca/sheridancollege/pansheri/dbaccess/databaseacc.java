package ca.sheridancollege.pansheri.dbaccess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.pansheri.Beans.Movie;

@Repository
public class databaseacc {

	  @Autowired
	    private NamedParameterJdbcTemplate jdbc;

	    public void insertMovie(Movie movie) {
	        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

	        String query = "INSERT INTO movie(name, genre, releaseYear) VALUES (:name, :genre, :YearOfPublish)";
	        namedParameters.addValue("name", movie.getName());
	        namedParameters.addValue("genre", movie.getGenre());
	        namedParameters.addValue("YearOfPublish", movie.getYearOfPublish());

	        jdbc.update(query, namedParameters);
	    }

	    public List<Movie> getMovieList() {
	        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	        String query = "SELECT * FROM movie ";
	        return jdbc.query(query, namedParameters, new BeanPropertyRowMapper<>(Movie.class));
	    }

	    public List<Movie> getMovieListByYear(int releaseYear) {
	        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	        String query = "SELECT * FROM movie WHERE YearOfPublish = :YearOfPublish";
	        namedParameters.addValue("YearOfPublish", releaseYear);

	        return jdbc.query(query, namedParameters, new BeanPropertyRowMapper<>(Movie.class));
	    }
	}