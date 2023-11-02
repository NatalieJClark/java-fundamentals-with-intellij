package bites.examples;

import javax.swing.text.StyledEditorKit;

public class ReadingList {

    // Class attributes:
    String[] unread;

    public ReadingList(String[] unread) {
        this.unread = unread;
    }

    // Main method:
    public static void main(String[] args) {
        ReadingList readingList = new ReadingList(new String[4]);
        readingList.add("Emma");
        readingList.add("Sense & Sensibility");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
        System.out.println("--------------");
        ReadingList newReadingList = new ReadingList(new String[4]);
        newReadingList.add("new book");
        System.out.println(newReadingList.unread[0]);
        System.out.println(newReadingList.unread[1]);
        System.out.println(newReadingList.unread[2]);
        System.out.println(newReadingList.unread[3]);
    }

    // Add book to unread array
    private void add(String bookTitle) {
        boolean continueSearch = true;
        int index = 0;
        while(continueSearch) {
            if (unread[index] == null) {
                unread[index] = bookTitle;
                continueSearch = false;
            } else {
                index++;
            }
        }
    }

}
