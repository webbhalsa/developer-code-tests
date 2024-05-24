package org.warCardGame;

public class App {
    public String getGreeting() {
        return "Welcome to WAR!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
