/* Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87} */


public class Exercise {
  public static int[] findTopTwoScores(int[] array){
    int firstTop=Integer.MIN_VALUE;
    int secondTop=Integer.MIN_VALUE;
    
    for(int score:array){
        if(score>firstTop){
            secondTop=firstTop;
            firstTop=score;
        }else if(score > secondTop && score < firstTop){
            secondTop=score;
        }
    }
    return new int[]{firstTop,secondTop};
  }

}