package com.kodilla.good.patterns.challanges;

import java.util.stream.Collectors;

public class Movie {
    public static void main(String[] args){
        new Movie().printAllTitles(new MovieStore());
    }

    public void printAllTitles(MovieStore movieStore) {
        String displayed = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(displayed);
    }
}
