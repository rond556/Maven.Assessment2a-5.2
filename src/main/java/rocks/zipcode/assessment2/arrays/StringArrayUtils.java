package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex)
            throws IllegalArgumentException {
        if(startingIndex < 0 || endingIndex < 0){
            throw new IllegalArgumentException();
        }

        String[] splicedArray = new String[endingIndex - startingIndex];
        Integer startingLocation = 0;
        for(int i = startingIndex; i < endingIndex; i++){
            splicedArray[startingLocation] = arrayToBeSpliced[i];
            startingLocation++;
        }
        return splicedArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) throws IndexOutOfBoundsException, IllegalArgumentException{
        if(startingIndex < 0){
            throw new IndexOutOfBoundsException();
        }
        if(startingIndex > arrayToBeSpliced.length){
            throw new IllegalArgumentException();
        }

        String[] splicedArray = new String[arrayToBeSpliced.length - startingIndex];
        Integer startingLocation = 0;
        for(int i = startingIndex; i < arrayToBeSpliced.length; i++){
            splicedArray[startingLocation] = arrayToBeSpliced[i];
            startingLocation++;
        }
        return splicedArray;
    }
}
