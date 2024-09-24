package com.arepas.app.controller;

import com.arepas.app.model.Suggestion;
import com.arepas.app.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suggestions")
public class SuggestionController {
    @Autowired
    private SuggestionService suggestionService;

    @GetMapping
    public List<Suggestion> getAllSuggestions() {
        return suggestionService.findAll();
    }

    @PostMapping
    public Suggestion createSuggestion(@RequestBody Suggestion suggestion) {
        return suggestionService.save(suggestion);
    }
}