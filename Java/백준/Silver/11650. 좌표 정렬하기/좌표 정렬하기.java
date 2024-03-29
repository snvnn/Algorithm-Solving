import java.util.*;

public class Main {
    public static class CPoint {
        int x; int y;

        public void setPoint(int a, int b){
            this.x = a;
            this.y = b;
        }

        public void print(){
            System.out.println(this.x +" "+this.y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        CPoint[] pointArray = new CPoint[testcase];

        int xMax = -100000;
        int yMax = -100000;

        int xMin = 100000;
        int yMin = 100000;

        for (int i = 0; i < testcase; i++) {
            CPoint tempPoint = new CPoint();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x > xMax)
                xMax = x;
            else if(x < xMin)
                xMin = x;

            if(y > yMax)
                yMax = y;
            else if (y < yMin)
                yMin = y;

            tempPoint.setPoint(x, y);
            pointArray[i] = tempPoint;
        }


        int suffix = yMax - yMin + 1;
        int[] yTemp = new int[suffix];
        CPoint[] cTemp = new CPoint[testcase];

        for (int i = 0; i < yTemp.length; i++) {
            yTemp[i] = 0;
        }

        for (int i = 0; i < pointArray.length; i++){
            yTemp[pointArray[i].y-yMin] ++ ;
        }

        for (int i = 1; i < yTemp.length; i++){
            yTemp[i] = yTemp[i] + yTemp[i-1];
        }

        for (int i = pointArray.length-1; i >= 0 ; i--){

            CPoint tempPoint = new CPoint();
            int x = pointArray[i].x;
            int y = pointArray[i].y;
            tempPoint.setPoint(x, y);


            yTemp[pointArray[i].y-yMin]--;
            cTemp[yTemp[pointArray[i].y-yMin]] = tempPoint;
        }

        suffix = xMax - xMin + 1;
        int[] xTemp = new int[suffix];
        CPoint[] sorted = new CPoint[testcase];

        for (int i = 0; i < xTemp.length; i++) {
            xTemp[i] = 0;
        }

        for (int i = 0; i < cTemp.length; i++){
            xTemp[cTemp[i].x-xMin]++;
        }

        for (int i = 1; i < xTemp.length; i++){
            xTemp[i] = xTemp[i] + xTemp[i-1];
        }

        for (int i = cTemp.length-1; i >= 0 ; i--){

            CPoint tempPoint = new CPoint();
            int x = cTemp[i].x;
            int y = cTemp[i].y;
            tempPoint.setPoint(x, y);
            
            xTemp[cTemp[i].x-xMin]--;
            sorted[xTemp[cTemp[i].x-xMin]] = tempPoint;
        }



        for (int i = 0; i < sorted.length; i++) {
            sorted[i].print();
        }
    }
}
