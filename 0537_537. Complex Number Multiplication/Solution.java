import com.sun.accessibility.internal.resources.accessibility;

/*
 * @lc app=leetcode id=537 lang=java
 *
 * [537] Complex Number Multiplication
 */
class Solution {
    public String complexNumberMultiply(String a, String b) {
        
        int[] aComponents = splitRealPartAndImaginaryPart(a);
        int[] bComponents = splitRealPartAndImaginaryPart(b);

        int real = aComponents[0] * bComponents[0] - aComponents[1] * bComponents[1];
        int imaginary = aComponents[1] * bComponents[0] + aComponents[0] * bComponents[1];
        
        String result = String.valueOf(real) + "+" + String.valueOf(imaginary) + "i";
        return result;
    }

    public int[] splitRealPartAndImaginaryPart(String a){
        String[] aComponents = a.split("\\+");
        int realPartA = 0;
        int imaginaryPartA = 0;
        if(aComponents.length == 0 || aComponents.length > 2){
            return new int[]{realPartA, imaginaryPartA};
        }
        else if (aComponents.length == 1) {
            String part = aComponents[0];
            if(part.contains("i")){
                imaginaryPartA = Integer.parseInt(part.replace("i", ""));
            }
            else{
                realPartA = Integer.parseInt(part);
            }
            return new int[]{realPartA, imaginaryPartA};
        }
        else {
            realPartA = Integer.parseInt(aComponents[0]);
            imaginaryPartA = Integer.parseInt(aComponents[1].replace("i", ""));
            return new int[]{realPartA, imaginaryPartA};
        }
    }
}


