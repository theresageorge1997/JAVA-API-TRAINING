package com.streamsapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static  void show(){

        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",30),
                new Movie("c",20),
                new Movie("d",20)

        );

        System.out.println("using map and collectors and toMap identify");
        var result7 = movies.stream()
                .filter(m->m.getLikes()>10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(result7);

        System.out.println("using map and collectors and toMap identify");
        var result6 = movies.stream()
                .filter(m->m.getLikes()>10)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(result6);

        System.out.println("using map and collectors and toMap lambda");
        var result5 = movies.stream()
                .filter(m->m.getLikes()>10)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
        System.out.println(result5);


        System.out.println("using map and collectors and toMap");
        var result4 = movies.stream()
                .filter(m->m.getLikes()>10)
                .collect(Collectors.toMap(m->m.getTitle(), m->m.getLikes()));
        System.out.println(result4);


        System.out.println("using map and collectors and toList");
        var result3 = movies.stream()
                .filter(m->m.getLikes()>10)
                .collect(Collectors.toList());
        System.out.println(result3);

        System.out.println("using map and collectors and toSet");
        var result2 = movies.stream()
                .filter(m->m.getLikes()>10)
                .collect(Collectors.toSet());
        System.out.println(result2);

        System.out.println("sum using optional, map and reduce");
        Optional<Integer> sum = Optional.ofNullable(movies.stream()
                .map(m -> m.getLikes())
                .reduce(0, Integer::sum));
        System.out.println(sum);


        System.out.println("using stream and findFirst");
        var result1 =movies.stream()
                .findFirst().get();
        System.out.println(result1.getTitle());

        System.out.println("using stream and allMatch");
        var result =movies.stream()
                .allMatch(m->m.getLikes()<20);
        System.out.println(result);

        System.out.println("using stream, predicate and filter");
        Predicate<Movie> isPopular = m-> m.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("using stream and takeWhile");
        movies.stream()
                .takeWhile(m->m.getLikes()<30)
                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("using stream and dropWhile");
        movies.stream()
                .dropWhile(m->m.getLikes()<30)
                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("using stream and sort");
        movies.stream()
                .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("using stream and comparator");
        movies.stream()
                .sorted(Comparator.comparing(m->m.getTitle()))
                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("using stream and comparator lambda");
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("using stream and map");
        movies.stream()
                .map(Movie::getLikes)
                .forEach(System.out::println);


        System.out.println("using stream, distinct and map");
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);


        System.out.println("using skip");
        movies.stream()
                .skip(2)
                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("using limit");
        movies.stream()
                .limit(2)
                .forEach(m-> System.out.println(m.getTitle()));

        System.out.println("using mapToInt");
        movies.stream()
                .mapToInt(m->m.getLikes())
                .forEach(m-> System.out.println(m));

        System.out.println("using mapToDouble");
        movies.stream()
                .mapToDouble(m->m.getLikes())
                .forEach(m-> System.out.println(m));

        System.out.println("using stream, filter,peek and map");
        movies.stream()
                .filter(m->m.getLikes()>10)
                .peek(m-> System.out.println("filtered:  "+ m.getTitle()))
                .map(Movie::getTitle)
                .peek(t-> System.out.println("mapped: "+ t))
                .forEach(System.out::println);

        System.out.println("using streams");
        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
        stream.forEach(list-> System.out.println(list));

        System.out.println("using streams and flatmap");
        var stream1 = Stream.of(List.of(1,2,3), List.of(4,5,6));
        stream1
                .flatMap(list->list.stream())
                .forEach(n-> System.out.println(n));


    }




}
