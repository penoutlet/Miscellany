package com.example.codinginterview.sorting;

class GoodMorning {
    public static void main(String[] args) {
        Girlfriend elyse = (String greeting) -> System.out.println(greeting);
        elyse.wakesUp("Good morning!");
    }

}
// functional interface (has one method)
// on line 5 i actually define how the method should behave
// and on line 6 I call it
interface Girlfriend {
    void wakesUp(String Greeting);
}

interface Buddy {
    void wakesUp(String greeting);
}