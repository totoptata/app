public class Video {
    private String name;
    private int min;
    private String link;
    private String lesson;

    public Video(String name, int min, String link, String lesson) {
        this.name = name;
        this.min = min;
        this.link = link;
        this.lesson = lesson;
    }

    public Video(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", min=" + min +
                ", link='" + link + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}
