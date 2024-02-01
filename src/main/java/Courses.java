class Course{
    private String coursename;
    private int courcetime;

    public Course(String coursename, int courcetime) {
        this.coursename = coursename;
        this.courcetime = courcetime;
    }
    public Course(){

    }

    public int getCourcetime() {
        return courcetime;
    }

    public void setCourcetime(int courcetime) {
        this.courcetime = courcetime;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursename='" + coursename + '\'' +
                ", courcetime=" + courcetime +
                '}';
    }
}
