package bites.examples;

// Learning to use Interfaces in Java
public interface GenericDiary {
    public void addEntry(String diaryEntry);
    public void removeEntry(int entryIndex);
    public String readEntry(int entryIndex);
}
