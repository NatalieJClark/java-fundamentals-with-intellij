package bites.examples;

public interface GenericDiary {
    public void addEntry(String diaryEntry);
    public void removeEntry(int entryIndex);
    public String readEntry(int entryIndex);
}
