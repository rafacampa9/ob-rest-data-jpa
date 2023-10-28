package com.example.obrestdatajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/kenpachi")
    public String kenpachi(){
        return "Kenpachi";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){
        return """
                <!doctype html>
                <html lang="es">
                  <head>
                    <!-- Required meta tags -->
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                                
                    <!-- Bootstrap CSS -->
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.rtl.min.css" integrity="sha384-nU14brUcp6StFntEOOEBvcJm4huWjB0OcIeQ3fltAfSmuZFrkAif0T+UtNGlKKQv" crossorigin="anonymous">
                                
                    <title>Kento Nanami</title>
                  </head>
                  <body>
                    <h1>Soy Kento Nanami, y me enfrento a Zen'in Toji</h1>
                    <a class = "btn btn-primary" href="https://www.google.es/search?q=zenin+toji&sca_esv=577401633&source=hp&ei=U8Q8ZZ74A_KMkdUP36GroAE&iflsig=AO6bgOgAAAAAZTzSY04b0pQGX5yheplTkAAgz-m9Mjmy&oq=zenin+to&gs_lp=Egdnd3Mtd2l6Igh6ZW5pbiB0byoCCAAyBRAAGIAEMgUQABiABDIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB5I_RdQAFiCCXAAeACQAQCYAdYBoAHiB6oBBTAuNy4xuAEDyAEA-AEBwgILEC4YgAQYxwEY0QPCAgUQLhiABMICCxAuGMcBGNEDGIAEwgILEC4YrwEYxwEYgATCAgsQLhiABBjHARivAcICBxAAGIAEGAo&sclient=gws-wiz">
                    Zen'in Toji
                    </a>            
                    <!-- Optional JavaScript; choose one of the two! -->
                                
                    <!-- Option 1: Bootstrap Bundle with Popper -->
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
                                
                    <!-- Option 2: Separate Popper and Bootstrap JS -->
                    <!--
                    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
                    -->
                  </body>
                </html>
                """;
    }
}
