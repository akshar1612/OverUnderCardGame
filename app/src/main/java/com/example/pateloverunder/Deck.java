package com.example.pateloverunder;

public class Deck {

    private int count;
    //TO DO: make the length that matches your number of cards private Card data[] = new Card[4];
    private Card data[] = new Card[48];

    public Deck() {

        shuffle();
    }

    public void shuffle() {

        String question[] = {
                "How high is Mt. Everest",
                "How long is Lake Ontario (In KM)?",
                "When was the treaty of Versailles signed?",
                "What year was the movie Avengers Endgame released?",
                "How tall is a giraffe (in meters)?",
                "What percent of your body is water",
                "How many gallons of milk does a cow produce in one day?",
                "If you counted up from 1 to 100, at one number per second, how long would it take? (days)",
                "What is the surface area of an adults intesteins? (Square feet)",
                "What year was pluto demoted to a dwarf planet?",
                "What percent of earth is desert?",
                "What percent of earth is water?",
                "What percent of earth's oceans have we discovered?",
                "What year did google come out",
                "What year was the United Nations founded?",
                "How many Emmys did the TV show The West Wing win in 2010?",
                "What year was the first radio broadcast made?",
                "Approximately how many postal codes are in the United States",
                "In what year did James Buchanan became president of America",
                "What was the population per square mile in Brooklyn, NY in 2010?",
                "How many countires does Colombia share boarders with?",
                "What is the surface area of a medium sizes egg?",
                "What percentage of the US population is left handed",
                "In what year were the first Grammy Awards held?",
                "How tall was Abraham Lincoln, the tallest US President?",
                "How many episodes were produced of the TV show Gunsmoke",
                "In what year did the population of the US surpass 75 million?",
                "How many gallons of water are in an Olympic sized swimming pool?",
                "In what year did Bram Stoker write Dracula",
                "WHat is the average life spam of a red blood cell?",
                "How many episodes are in the TV show I Love Lucy?",
                "In what year was Quebec City founded?",
                "WHat is the total height of Niagara Falls? (feet)",
                "How many missions did the US Space Shuttle fly between 1981 and 2011?",
                "In what year did the world's firs croquet tournament take place",
                "What is the average speed of a raindrop falling? (MPH)",
                "What is the official capacity of Michigan Stadium in Ann Arbor?",
                "When did Queen Beatrix become monarch of the Netherlands",
                "How many public libraries were there in America in 1955?",
                "How many species of vampire bat are there?",
                "In what year did Illinois become a state?",
                "In what year was the Eiffel Tower in Paris inaugurated?",
                "How many times per second does a Hummingbird flap its wings?",
                "How many African countries are part of the United Nations",
                "How many albums by Led Zeppelin reached #1 in US in the 1970's?",
                "In what year were Mar's two moons, Deimos and Phobos, discovered?",
                "In what year did Casablanca win the Academy Award for Best Picture?",
                "In what year was Ernest Hemingway's A Farewell to Arms published?"};

        int ans[] = {29092, 310, 1919, 2019, 5, 75, 7, 12, 6562, 2006, 20, 71, 5, 1998, 1945, 4, 1920,
                43000, 1857, 35369, 5, 11, 13, 1959, 193, 635, 1900, 660000, 1897, 120, 180, 1608, 167, 135, 1867, 7, 109901, 1980, 8420, 3, 1818, 1889, 50, 54, 7, 1877, 1943, 1929};

        int fake[] = {29192, 312, 1819, 2018, 2, 65, 8, 13, 6362, 2003, 40, 61, 4, 1988, 1939, 3, 1910,
                45000, 1867, 34469, 4, 10, 12, 1969, 192, 645, 1910, 660010, 1887, 127, 184, 1618, 168, 134, 1877, 6, 109911, 1970, 8320, 4, 1819, 1888, 40, 48, 8, 1807, 1953, 1928};

        for (int i = 0; i < 47; i++) {

            int r1 = (int) (Math.random() * question.length);
            int r2 = (int) (Math.random() * question.length);
            String temp = question[r1];
            question[r1] = question[r2];
            question[r2] = temp;

            int temp1 = fake[r1];
            fake[r1] = fake[r2];
            fake[r2] = temp1;

            int temp3 = ans[r1];
            ans[r1] = ans[r2];
            ans[r2] = temp3;

        }

        count = 0;

        for (int i = 0; i < question.length; i++) {
            Card c = new Card(question[i], fake[i], ans[i]);
            push(c);
        }

    }

    public void push(Card addMe) {
        data[count] = addMe;
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isFull() {
        return (count == 47);
    }

    public Card pop() {
        count--;
        return data[count];
    }

    public Card peek() {
        return data[count--];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void clear() {
        count = 0;
    }
}


