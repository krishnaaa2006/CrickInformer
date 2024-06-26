package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get all matches



    List<Match> getAllMatches();

    //get live matches
    default List<Match> getLiveMatches() {
        return this.getLiveMatches();
    }

    //get wc point table
    List<Map<String,String>> getPointTable();

}
