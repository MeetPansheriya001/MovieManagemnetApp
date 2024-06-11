package ca.sheridancollege.pansheri.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.pansheri.Beans.Movie;
import ca.sheridancollege.pansheri.dbaccess.databaseacc;

@Controller
public class MovieController {

 @Autowired
 private databaseacc da;

 @GetMapping("/")
 public String index(Model model) {
     model.addAttribute("movie", new Movie());
     model.addAttribute("movieList", da.getMovieList());
     return "index";
 }

 @GetMapping("/displayByYearForm")
 public String displayByYearForm() {
     return "displayByYearForm";
 }

 @PostMapping("/insertMovie")
 public String insertMovie(Model model, @ModelAttribute Movie movie) {
     da.insertMovie(movie);
     model.addAttribute("movie", new Movie());
     model.addAttribute("movieList", da.getMovieList());
     return "index";
 }

 @PostMapping("/displayByYear")
 public String displayByYearForm(@RequestParam int releaseYear, Model model) {
     List<Movie> moviesByYear = da.getMovieListByYear(releaseYear);
     model.addAttribute("movie", new Movie());
     model.addAttribute("movieList", moviesByYear);
     return "index";
 }
}

