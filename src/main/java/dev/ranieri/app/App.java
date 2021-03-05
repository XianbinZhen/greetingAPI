package dev.ranieri.app;

import io.javalin.Javalin;

public class App {

    private static int httpRequestCounter = 0; // primitive values default to 0

    public static void main(String[] args) {

        Javalin app = Javalin.create();

        app.get("/hello",(ctx)->{
            ctx.result("Hello!!!! total requests: " + ++httpRequestCounter );
        });

        app.get("/hola",(ctx)->{
            ctx.result("Hola!!!! total requests: " + ++httpRequestCounter );
        });

        app.start();
    }
}
