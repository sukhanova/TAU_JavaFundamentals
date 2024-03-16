package chapter12.optionalExercise;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args){
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> test2 = TestResults.getMakeUpGrades();

        for(var student : test2.entrySet()){
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = test2.get(student.getKey());

            if(secondGrade > firstGrade){
                gradeBook.put(student.getKey(), secondGrade);
            }
        }

        System.out.println("Final Grades:");
        gradeBook.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
    }
}
