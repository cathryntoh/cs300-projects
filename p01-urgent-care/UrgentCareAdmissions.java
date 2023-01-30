package p01_urgent_care;

public class UrgentCareAdmissions {
  
  static final int RED = 0;
  static final int YELLOW = 1;
  static final int GREEN = 2;
  
  /**
   * A helper method to find the correct index to insert a new patient at the given triage level. 
   * This should be the index AFTER the last index currently occupied by a patient at that level.
   * If the list is FULL, the method should return -1 regardless of the triage value. 
   * This method must not modify patientsList in any way.
   * <p>
   * @param triage the urgency level of the next patient's issue, RED YELLOW or GREEN
   * @param patientsList the current, active list of patient records
   * @param size the number of patients currently in the list
   * @return the index at which the patient should be inserted into the list, 
   *     or -1 if the list is full
   */
  public static int getAdmissionIndex(int triage, int[][] patientsList, int size) {
    
    if (patientsList.length == size) return -1;
    
    int idx = 0;
    for (int i = 0; i < size; i++) {
      if (triage >= patientsList[i][2]) {
        idx++;
      }
    }
    return idx;
  }
  
  /** 
   * Adds the patient record, a three-element perfect size array of ints, to the patients list in 
   * the given position. This method must maintain the ordering of the rest of the array, so any 
   * patients in higher index positions must be shifted out of the way.
   * If there is no room to add a new patient to the array or the index provided is not a valid 
   * index into the oversize array (for adding, valid indexes are 0 through size), the method 
   * should not modify the patientsList array in any way.
   * <p>
   * @param patientRecord a three-element perfect size array of ints, containing the patient's 
   *     5-digit case ID, their admission order number, and their triage level
   * @param index the index at which the patientRecord should be added to patientsList, assumed to 
   *     correctly follow the requirements of getAdmissionIndex()
   * @param patientsList the current, active list of patient records
   * @param size the number of patients currently in the list
   * @return the number of patients in patientsList after this method has finished running
   */
  public static int addPatient(int[] patientRecord, int index, int[][] patientsList, int size) {
    
    if (size == patientsList.length || index >= patientsList.length || index < 0) return size;
    
    for (int i = size; i > index; i--) {
      patientsList[i] = patientsList[i-1];
    }
    patientsList[index] = patientRecord;
    
    return ++size;
  }
  
  /** 
   * Removes the patient record at index 0 of the patientsList, if there is one, and updates the 
   * rest of the list to maintain the oversize array in its current ordering.
   * <p>
   * @param patientsList the current, active list of patient records
   * @param size the number of patients currently in the list
   * @return the number of patients in patientsList after this method has finished running
   */
  public static int removeNextPatient(int[][] patientsList, int size) {
//    patientsList[0] = null;
//    for (int i = 0; i < size; i++) {
//      patientsList[i] = patientsList[i+1];
//    }
//    return size-1;
    return -1;
  } 
  
  /** 
   * Finds the index of a patient given their caseID number. This method must not modify 
   * patientsList in any way.
   * <p>
   * @param caseID the five-digit case number assigned to the patient record to find
   * @param patientsList the current, active list of patient records
   * @param size the number of patients currently in the list
   * @return the index of the patient record matching the given caseID number, or -1 if the list is 
   *     empty or the caseID is not found
   */
  public static int getPatientIndex(int caseID, int[][] patientsList, int size) {
    for (int i = 0; i < size; i++) {
      if (patientsList [i][0] == caseID) return i;
    }
    return -1;
  }
  
  /**
   * Finds the patient who arrived earliest still currently present in the patientsList, and 
   * returns the index of their patient record within the patientsList. The arrival value is 
   * strictly increasing for each new patient, so you will not need to handle the case where two 
   * values are equal. That is, for all patient records [ caseID, arrivalOrder, triage ], this 
   * method should find and return the one with the minimum arrivalOrder value.
   * This method must not modify patientsList in any way.
   * <p>
   * @param patientsList the current, active list of patient records
   * @param size the number of patients currently in the list
   * @return the index of the patient record with the smallest value in their arrival integer, 
   *     or -1 if the list is empty
   */
  public static int getLongestWaitingPatientIndex(int[][] patientsList, int size) {
    return -1;
  }
  
  /**
   * Creates a formatted String summary of the current state of the patientsList array, as follows:
   * Total number of patients: 5
   * RED: 1
   * YELLOW: 3
   * GREEN: 1
   * The first line displays the current size of the array. The next three lines display counts of 
   * patients at each of the three triage levels currently in the patientsList. Any or all of these 
   * numbers may be 0. This method must not modify the patientsList array in any way.
   * <p>
   * @param patientsList the current, active list of patient records
   * @param size the number of patients currently in the list
   * @return a String summarizing the patientsList as shown in this comment
   */
  public static String getSummary(int[][] patientsList, int size) {
    int countRed = 0;
    int countYellow = 0;
    int countGreen = 0;
    for (int i = 0; i < size; i++) {
      if (patientsList[i][2] == RED) {
        countRed++;
      }
      if (patientsList[i][2] == YELLOW) {
        countYellow++;
      }
      if (patientsList[i][2] == GREEN) {
        countGreen++;
      }
    return "";
    
    }
    
    return null;
  }

}
