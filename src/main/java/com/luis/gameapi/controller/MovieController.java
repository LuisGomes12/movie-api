package com.luis.gameapi.controller;

import com.luis.gameapi.model.Movie;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private List<Movie> lista = new ArrayList<>();
    private AtomicLong contadorId = new AtomicLong(1);

    @GetMapping
    public List<Movie> listar() {
        return lista;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> buscarPorId(@PathVariable Long id) {
        Movie filme = encontrarPorId(id);

        if (filme == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filme);
    }

    @PostMapping
    public ResponseEntity<Movie> adicionar(@RequestBody Movie movie) {
        movie.setId(contadorId.getAndIncrement());
        lista.add(movie);
        return ResponseEntity.status(201).body(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> editar(@PathVariable Long id, @RequestBody Movie movieAtualizado) {
        Movie fime = encontrarPorId(id);

        if (fime == null) {
            return ResponseEntity.notFound().build();
        }

        fime.setNome(movieAtualizado.getNome());
        fime.setNota(movieAtualizado.getNota());

        return ResponseEntity.ok(fime);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Movie filme = encontrarPorId(id);

        if (filme == null) {
            return ResponseEntity.notFound().build();
        }

        lista.remove(filme);
        return ResponseEntity.noContent().build();
    }

    private Movie encontrarPorId(Long id) {
        return lista.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}