package hee.boj.sort;

import java.awt.*;
import java.util.*;

public class Hee_Q11650 {
    // 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int count = scanner.nextInt();

        ArrayList<Point> arrayLists = new ArrayList<>();

        for(int i=0; i<count; i++){
            Point point = new Point();
            point.x = scanner.nextInt();
            point.y = scanner.nextInt();

            arrayLists.add(point);
        }


        PointComparator pointComparator = new PointComparator();
        Collections.sort(arrayLists, pointComparator);

        for(int i=0; i<count; i++){
            System.out.println(arrayLists.get(i).x + " " + arrayLists.get(i).y);
        }
    }

    public static class PointComparator implements Comparator<Point> {

        @Override
        public int compare(Point point1, Point point2) {
            int res = -1;

            if (point1.x > point2.x) {
                res = 1;
            }
            else if (point1.x == point2.x) {
                if (point1.y > point2.y) {
                    res = 1;
                }
            }

            return res;
        }
    }
}

/*
처음에 Point 클래스를 이용하려 했는데 compare 함수를 작성하려면 Point 클래스를 만들어야 되는 생각밖에 못했네요 :(
comparator 클래스를 만들어 정렬 방식을 지정하는 sort 방법에 대해 알아갑니다~
*/
