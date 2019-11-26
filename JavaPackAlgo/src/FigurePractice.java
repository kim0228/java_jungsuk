import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class FigurePractice {
	public static void main(String[] args) {
		// 두 선이 교차하는지 여부 확인: 인스턴스 메소드사용
		Line2D line1 = new Line2D.Double(0, 0, 10, 10);
		Line2D line2 = new Line2D.Double(9, 9, 0, 0);
		/////// System.out.println(line1.intersectsLine(line2));
		// 두 선이 교차하는지 여부 확인: static 메소드 사용
		// System.out.println(Line2D.linesIntersect(0, 0, 10, 10, 9, 9, 0, 0));
		
		// 두 사각형이 한 사각형 안에 포함되는지 여부와 교차하는지 여부
		Rectangle2D r1 = new Rectangle2D.Double(0, 0, 20, 20);
		Rectangle2D r2 = new Rectangle2D.Double(1, 1, 5, 5);
		
		System.out.println(r1.contains(r2));
		System.out.println(r2.contains(r1));
		System.out.println(r1.intersects(r2));
		System.out.println(r2.intersects(r1));
		
		// 두 사각형이 겹치는 부분 구하기
		Rectangle2D dest = new Rectangle2D.Double();
		Rectangle2D.intersect(r1, r2, dest);
		
		System.out.println(dest);
		
		Point2D p1 = new Point2D.Double(2, 2);
		Point2D p2 = new Point2D.Double(30, 30);
		
		System.out.println(r1.contains(p1));
		System.out.println(r1.contains(p2));
	}
}
