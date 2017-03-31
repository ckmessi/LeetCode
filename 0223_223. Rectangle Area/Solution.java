public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
       
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        int overlap = 0;
         if(A >= G || B >= H || C <= E || D <= F){
            overlap= 0;
        }
        else{
            overlap = (Math.min(C, G) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F));
        }
        int area = area1 + area2 - overlap;
        return area;
    }
}
