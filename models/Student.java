package models;
/**
* Student function
* Stores student ID and Name
* @param stdId stores Student ID
* @param stdName stores Student ID
* return outputs the Name and ID
*/
public class Student {
    private String stdId;
    private String stdName;

    public Student(String stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }

    /**
    * Getter for stdId
    */
    public String getStdId() {
        return stdId;
    }
    /**
    * Setter for stdId
    */
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    /**
    * Getter for stdName
    */
    public String getStdName() {
        return stdName;
    }

    /**
    * Setter for stdName
    */
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    @Override
        public String toString() {
            return "ID: " + stdId + " | Name: " + stdName;
        }
}
