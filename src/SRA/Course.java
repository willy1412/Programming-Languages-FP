/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRA;

/**
 *
 * @author Willy1412
 */
public class Course {
    String courseMajor;
    String courseCode;
    String courseName;
    String courseQuota;
    
    public Course(String courseMajor){
        this.courseMajor = courseMajor;
    }
    
    public Course(String courseCode, String courseName, String courseQuota) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseQuota = courseQuota;
    }

    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseQuota() {
        return courseQuota;
    }

    public void setCourseQuota(String courseQuota) {
        this.courseQuota = courseQuota;
    }
  
}
