package com.missilaneousPrograms;


class CopyOneArrayToAnother {  
    public static void main(String[] args) {  
        //declaring a source array  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        //declaring a destination array  
        char[] copyTo = new char[7];  
      
//        * @param      src      the source array.
//        * @param      srcPos   starting position in the source array.
//        * @param      dest     the destination array.
//        * @param      destPos  starting position in the destination data.
//        * @param      length   the number of array elements to be copied.
        
        System.arraycopy(copyFrom, 3, copyTo, 0, 7);  
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));  
        
        char[] temp=copyFrom;
        System.out.println("ass="+String.valueOf(temp));
        
        // or
        
        char[]  temp2=copyFrom.clone();
        System.out.println("after cloning ="+String.valueOf(temp2));
    }  
    
    
}  