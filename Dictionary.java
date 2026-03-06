package Assignment_02;

import java.util.*;

public class Dictionary {

    private HashMap<String, List<Entry>> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
        loadData();
    }

    private void loadData() {

        for (DictionaryData d : DictionaryData.values()) {

            Entry entry = new Entry(
                d.getKeyword(),
                d.getPartOfSpeech(),
                d.getDefinition()
            );

            String key = d.getKeyword().toLowerCase();

            dictionary.putIfAbsent(key, new ArrayList<>());
            dictionary.get(key).add(entry);
        }
    }

    public List<Entry> search(
            String keyword,
            String partOfSpeech,
            boolean distinct,
            boolean reverse
    ) {

        List<Entry> results = new ArrayList<>();

        String key = keyword.toLowerCase();

        if (!dictionary.containsKey(key)) {
            return results;
        }

        results.addAll(dictionary.get(key));

        if (partOfSpeech != null) {
            results.removeIf(e ->
                    !e.getPartOfSpeech().equalsIgnoreCase(partOfSpeech)
            );
        }

        if (distinct) {
            Set<String> seen = new HashSet<>();
            results.removeIf(e ->
                    !seen.add(
                            e.getKeyword() + "|" +
                                    e.getPartOfSpeech() + "|" +
                                    e.getDefinition()
                    )
            );
        }

        if (reverse) {
            Collections.reverse(results);
        }

        return results;
    }

    public void printResults(List<Entry> results) {

        if(results.isEmpty()) {
            System.out.println(
                    "<NOT FOUND> To be considered for the next release. Thank you."
            );
            return;
        }

        for (Entry e : results) {

            String keywordFormatted =
                    e.getKeyword().substring(0,1).toUpperCase() +
                            e.getKeyword().substring(1).toLowerCase();

            System.out.println(
                    keywordFormatted + " [" +
                            e.getPartOfSpeech().toLowerCase() +
                            "] : " +
                            e.getDefinition()
            );
        }
    }

    public int getKeywordCount() {
        return dictionary.size();
    }

    public int getDefinitionCount() {
        int count = 0;
        for (List<Entry> list : dictionary.values()) {
            count += list.size();
        }
        return count;
        
    }
    
}
