package com.crick.apis.contorllers;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){

        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);

    }
}
