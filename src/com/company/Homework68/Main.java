package com.company.Homework68;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Movie movie1 = new Movie("<<The Godfather>>", random.nextInt(10));
        Movie movie2 = new Movie("<<Green mile>>", random.nextInt(10));
        Movie movie3 = new Movie("<<The Lord of the rings>>", random.nextInt(10));
        Movie movie4 = new Movie("<<Interstellar>>", random.nextInt(10));
        Movie movie5 = new Movie("<<Schindler's list>>", random.nextInt(10));
        Movie movie6 = new Movie("<<Forrest gump>>", random.nextInt(10));
        Movie movie7 = new Movie("<<1 + 1>>", random.nextInt(10));
        Movie movie8 = new Movie("<<Back to the future>>", random.nextInt(10));
        Movie movie9 = new Movie("<<Pulp fiction>>", random.nextInt(10));
        Movie movie10 = new Movie("<<Inception>>", random.nextInt(10));

        Movie[] movies = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        for (int i = 0; i < movies.length - 1; i++) {
            for (int j = 0; j < movies.length - i - 1; j++) {
                if (movies[j].getRating() < movies[j + 1].getRating()) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }
        System.out.println("The best rated movie is " + movies[0].getTitle() + ", rating " + movies[0].getRating() + ".");
        if (movies[1].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[1].getTitle() + ", rating " + movies[1].getRating() + ".");
        }
        if (movies[2].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[2].getTitle() + ", rating " + movies[2].getRating() + ".");
        }
        if (movies[3].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[3].getTitle() + ", rating " + movies[3].getRating() + ".");
        }
        if (movies[4].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[4].getTitle() + ", rating " + movies[4].getRating() + ".");
        }
        if (movies[5].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[5].getTitle() + ", rating " + movies[5].getRating() + ".");
        }
        if (movies[6].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[6].getTitle() + ", rating " + movies[6].getRating() + ".");
        }
        if (movies[7].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[7].getTitle() + ", rating " + movies[7].getRating() + ".");
        }
        if (movies[8].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[8].getTitle() + ", rating " + movies[8].getRating() + ".");
        }
        if (movies[9].getRating() == movies[0].getRating()) {
            System.out.println("The best rated movie is " + movies[9].getTitle() + ", rating " + movies[9].getRating() + ".");
        }

    }
}

