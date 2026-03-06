package Assignment_02;

public class Entry {

    private String keyword;
    private String partOfSpeech;
    private String definition;

    public Entry(String keyword, String partOfSpeech, String definition) {
        this.keyword = keyword;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getKeyword() { return keyword; }
    public String getPartOfSpeech() { return partOfSpeech; }
    public String getDefinition() { return definition; }
}
