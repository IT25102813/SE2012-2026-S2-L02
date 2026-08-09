package models;
/**
 * Represents an academic course in the Student Management System
 * Stores course details including the course code and title
 */
public class Course {

    /** The code assigned to the course (e.g., SE2031)*/
    private String courseCode;

    /** The full descriptive title of the course[cite: 78]. */
    private String title;

    /**
     * @param courseCode The unique code for the course[cite: 34].
     * @param title The title or description of the course[cite: 34].
     */
    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
    }

    /**
    * Gets course code
    */
    public String getCourseCode() {
        return courseCode;
    }

    /**
    * Sets course code
    */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
    * Gets course title
    */
    public String getTitle() {
        return title;
    }

    /**
    * Sets course title
    */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + " | Title: " + title;
    }
}
