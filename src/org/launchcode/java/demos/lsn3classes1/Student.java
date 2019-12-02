package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

        private static int nextStudentId = 1;
        private String name;
        private final int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        }

    public Student() {
            this("Dottie Quick", 1788, 1, 4.0);
        }

        public String getName () {
            return name;
        }

        public void setName (String aName){
            name = aName;
        }

        public int getStudentId () {
            return studentId;
        }

//        public void setStudentId ( int aStudentId){
//            studentId = aStudentId;
//        }

        public int getNumberOfCredits () {
            return numberOfCredits;
        }

//        public void setNumberOfCredits ( int aNumberOfCredits){
//            numberOfCredits = aNumberOfCredits;
//        }

        public double getGpa () {
            return gpa;
        }

//        private void setGpa ( double aGpa){
//            gpa = aGpa;
//        }

    public String getGradeLevel() {
        if(this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int courseCredits, double grade) {
        double qualityScore = this.gpa *this.numberOfCredits;
        qualityScore = courseCredits * grade + qualityScore;
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        this.gpa = qualityScore / this.numberOfCredits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    // hashCode converts object to a number
    // @Override erases old method with your new custom one
}