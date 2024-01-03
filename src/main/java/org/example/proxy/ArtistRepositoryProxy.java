package org.example.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class ArtistRepositoryProxy extends ArtistRepository {

    private static Logger log = Logger.getLogger(ArtistRepositoryProxy.class.getName());

    private Map<Long, Artist> cache = new HashMap<>();



    @Override
    public Artist save(Artist artist) {
        log.info("STARTING SAVE METHOD CALL");
        Artist newartist = super.save(artist);
        log.info("METHOD SAVE WAS FINALIZED");
        return newartist;
    }

    @Override
    public Artist findById(Long id) {
        log.info("STARTING FIND BY ID METHOD CALL");
            if (Objects.nonNull(cache.get(id)))
            {
                log.info("GETTING FROM CACHE..."); // for example...
                return cache.get(id);
            }
        Artist artist = super.findById(id);
        log.info("METHOD FIND BY ID WAS FINALIZED");
        return artist;
    }
}
