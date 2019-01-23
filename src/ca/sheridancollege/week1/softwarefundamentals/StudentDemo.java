/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A model class to model Student Objects
 * @author dancye, 2019. 23rd Jan
 */
public class StudentDemo 
{

    

    
  private String studentID;
  private String name;
  private String program;
  private int MaxCourses;
  
  
  /**
   * A constructor to pass in the given ID and then name
   * @param givenID - the ID to assign
   * @param givenName- the name to assign 
   */
  public StudentDemo(String givenID, String givenName)
  {
      studentID = givenID;
      name = givenName;
  }
  
   /**
     * @return the PartTime
     */
    public boolean isPartTime() {
        return PartTime;
    }

    /**
     * @param givenPartTime the PartTime to set
     */
    public void setPartTime(boolean givenPartTime) {
        PartTime = givenPartTime;
    }
  /**
   * A method to set the student ID
   * @param givenID the ID to set
   */
  public void setStudentID(String givenID)
  {
      studentID=givenID;
  }
  /**
   * An accessor method for studentID
   * @return the student's ID 
   */
  public String getStudentID()
  {
      return studentID;
  }

    /**
     * A method to return the student's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the student's name
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String givenProgram) {
        program = givenProgram;
    }
    
    /**
     * @return the MaxCourses
     */
    public int getMaxCourses() {
        return MaxCourses;
    }

    /**
     * @param givenMaxCourses the MaxCourses to set
     */
    public void setMaxCourses(int givenMaxCourses) {
        MaxCourses = givenMaxCourses;
    }

   
}
