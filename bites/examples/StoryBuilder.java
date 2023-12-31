package bites.examples;

// Learning string concatenation in Java
public class StoryBuilder {
    // Class attributes:
    String plot;

    // Constructor:
    public StoryBuilder(String plot) {
        this.plot = plot;
    }

    public static void main(String[] args) {
        StoryBuilder storyBuilder = new StoryBuilder("Once upon a time,");
        storyBuilder.addPlotline(" in a land far, far away");
        System.out.println(storyBuilder.getPlot());
    }

    public void addPlotline(String content) {
        this.plot += content;
    }

    public String getPlot() {
        return this.plot;
    }

}
