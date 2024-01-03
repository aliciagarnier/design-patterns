package org.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class ArtistRepository {

    private Map<Long, Artist> artist = new HashMap<>();

    private static Long ID = 1L;


    public Artist save (Artist artist) {
       return this.artist.put(ID++, artist);
    }

    public void delete(Long id) {
        this.artist.remove(id);
    }

    public Artist findById(Long id) {
       return artist.get(id);
    }



}
