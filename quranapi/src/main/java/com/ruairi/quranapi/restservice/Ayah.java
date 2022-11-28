package main.java.com.ruairi.quranapi.restservice;

public class Ayah {

    private final long id;
    private final String verse;

    public Ayah(long id, String verse) {
        this.id = id;
        this.verse = verse;
    }
    
    public long getId() {
        return this.id;
    }

    public String getVerse() {
        return this.verse;
    }
}
