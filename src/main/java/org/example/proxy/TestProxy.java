package org.example.proxy;

public class TestProxy {

    public static void main(String[] args) {

        ArtistService service = new ArtistService(new ArtistRepositoryProxy());

        Artist artist = new Artist();
        artist.setName("Jennie");

        service.save(artist);

    }
}
