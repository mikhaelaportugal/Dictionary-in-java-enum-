# Dictionary 340 Java

A **console-based dictionary search application written in Java**.  
The program allows users to search for dictionary definitions by keyword and apply optional filters such as **part of speech**, **distinct results**, and **reverse ordering**.

---

## Features

- Search definitions by **keyword**
- Filter results by **part of speech**
- Remove duplicate results using **distinct**
- Display results in **reverse order**
- Built-in **help command**
- Handles invalid parameters gracefully

---

## Project Structure

### `Main.java`
Handles the **user interface and command parsing**.  
Reads user input and sends search requests to the dictionary.

### `Dictionary.java`
Responsible for:
- Loading dictionary entries
- Storing them in a `HashMap<String, List<Entry>>`
- Filtering results based on search parameters

### `Entry.java`
Represents a **single dictionary entry** containing:
- keyword
- part of speech
- definition

### `DictionaryData.java`
An **enum dataset** containing predefined dictionary entries that populate the dictionary when the program starts.

--

## Search Format

keyword [partOfSpeech] [distinct] [reverse]
