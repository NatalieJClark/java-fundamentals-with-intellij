package bites.examples;

public class TenDayDiary implements GenericDiary {

    String[] entries = new String[10];

    @Override
    public void addEntry(String diaryEntry) {
        for (int index = 0; index < entries.length; index++) {
            if (this.entries[index] == null) {
                this.entries[index] = diaryEntry;
                break;
            }
        }
    }

    @Override
    public void removeEntry(int entryIndex) {
        this.entries[entryIndex] = null;
    }

    @Override
    public String readEntry(int entryIndex) {
        return this.entries[entryIndex];
    }

    public static void main(String[] args) {
        TenDayDiary diary = new TenDayDiary();
        diary.addEntry("Entry 1");
        diary.addEntry("Entry 2");
        diary.addEntry("Entry 3");
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        System.out.println(diary.readEntry(2));
        System.out.println("-----------------------------");
        diary.removeEntry(0);
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        System.out.println(diary.readEntry(2));
        System.out.println("-----------------------------");
        diary.addEntry("This entry should be added at index 0");
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        System.out.println(diary.readEntry(2));
    }
}
