package com.movie.moviedemo.controller;

import com.movie.moviedemo.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "movie")
public class MovieController {

    @RequestMapping("")
    public String index() {
        return "index";
    }
    @RequestMapping("query")
    //@ResponseBody
    public String query(Model model,String movieName) {
        Movie movie = new Movie();
        movie.setName(movieName);
        movie.setType("科幻");
        movie.setMoney("10亿");
        model.addAttribute("movie",movie);
        return "movie";
    }

    @RequestMapping(value = "getMovie")
    @ResponseBody
    public String getMovie() {
        return "死侍";
    }

}
