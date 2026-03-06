package Assignment_02;

public enum DictionaryData {

    BOOK1("book","noun","A set of pages."),
    BOOK2("book","noun","A written work published in printed or electronic form."),
    BOOK3("book","verb","To arrange for someone to have a seat on a plane."),
    BOOK4("book","verb","To arrange something on a particular date."),

    ARROW1("arrow","noun","Here is one arrow: <IMG> -=>> </IMG>"),

    DISTINCT1("distinct","adjective","Familiar. Worked in Java."),
    DISTINCT2("distinct","adjective","Unique. No duplicates. Clearly different or of a different kind."),
    DISTINCT3("distinct","adverb","Uniquely. Written \"distinctly\"."),
    DISTINCT4("distinct","noun","A keyword in this assignment."),
    DISTINCT5("distinct","noun","A keyword in this assignment."),
    DISTINCT6("distinct","noun","A keyword in this assignment."),
    DISTINCT7("distinct","noun","An advanced search option."),
    DISTINCT8("distinct","noun","Distinct is a parameter in this assignment."),

    PLACEHOLDER1("placeholder","adjective","To be updated..."),
    PLACEHOLDER2("placeholder","adjective","To be updated..."),
    PLACEHOLDER3("placeholder","adverb","To be updated..."),
    PLACEHOLDER4("placeholder","conjunction","To be updated..."),
    PLACEHOLDER5("placeholder","interjection","To be updated..."),
    PLACEHOLDER6("placeholder","noun","To be updated..."),
    PLACEHOLDER7("placeholder","noun","To be updated..."),
    PLACEHOLDER8("placeholder","noun","To be updated..."),
    PLACEHOLDER9("placeholder","preposition","To be updated..."),
    PLACEHOLDER10("placeholder","pronoun","To be updated..."),
    PLACEHOLDER11("placeholder","verb","To be updated..."),

    REVERSE1("reverse","adjective","On back side."),
    REVERSE2("reverse","adjective","Opposite to usual or previous arrangement."),
    REVERSE3("reverse","noun","A dictionary program's parameter."),
    REVERSE4("reverse","noun","Change to opposite direction."),
    REVERSE5("reverse","noun","The opposite."),
    REVERSE6("reverse","noun","To be updated..."),
    REVERSE7("reverse","noun","To be updated..."),
    REVERSE8("reverse","noun","To be updated..."),
    REVERSE9("reverse","noun","To be updated..."),
    REVERSE10("reverse","verb","Change something to opposite."),
    REVERSE11("reverse","verb","Go back"),
    REVERSE12("reverse","verb","Revoke ruling."),
    REVERSE13("reverse","verb","To be updated..."),
    REVERSE14("reverse","verb","To be updated..."),
    REVERSE15("reverse","verb","Turn something inside out."),

    KEYWORD1("alpha","noun","To be updated..."),
    KEYWORD2("beta","noun","To be updated..."),
    KEYWORD3("gamma","verb","To be updated..."),
    KEYWORD4("delta","adjective","To be updated..."),
    KEYWORD5("epsilon","noun","To be updated..."),
    KEYWORD6("zeta","verb","To be updated..."),
    KEYWORD7("theta","adverb","To be updated..."),
    KEYWORD8("iota","conjunction","To be updated..."),
    KEYWORD9("kappa","interjection","To be updated..."),
    KEYWORD10("lambda","noun","To be updated..."),
    KEYWORD11("mu","pronoun","To be updated..."),
    KEYWORD12("nu","preposition","To be updated..."),
    KEYWORD13("xi","adjective","To be updated..."),
    KEYWORD14("omicron","verb","To be updated..."),
    KEYWORD15("pi","adjective","To be updated..."),
    KEYWORD16("rho","verb","To be updated..."),
    KEYWORD17("sigma","noun","To be updated..."),
    KEYWORD18("tau","adverb","To be updated..."),
    KEYWORD19("upsilon","verb","To be updated..."),
    KEYWORD20("phi","adjective","To be updated..."),
    KEYWORD21("chi","noun","To be updated..."),
    KEYWORD22("psi","verb","To be updated...");

    private String keyword;
    private String partOfSpeech;
    private String definition;

    DictionaryData(String keyword, String partOfSpeech, String definition) {
        this.keyword = keyword;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getKeyword() { return keyword; }
    public String getPartOfSpeech() { return partOfSpeech; }
    public String getDefinition() { return definition; }
}
