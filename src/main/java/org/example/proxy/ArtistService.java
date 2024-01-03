package org.example.proxy;

public class ArtistService {


    private ArtistRepository artistRepository;


    public ArtistService(ArtistRepository repository) {
        this.artistRepository = repository;
    }


    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }
}
