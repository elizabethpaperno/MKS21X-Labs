public class Triangle {
  private Point v1,v2,v3;
  public Triangle(Point v_1, Point v_2, Point v_3){
    v1 = v_1;
    v2 = v_2;
    v3 = v_3;
  }

  public Triangle(double v1x, double v1y, double v2x, double v2y, double v3x, double v3y){
    v1 = Point(v1x, v1y);
    v2 = Point(v2x, v2y);
    v3 = Point(v3x, v3y);
  }

  public Point getVertex(int num){
    if (num == 1){
      return v1;
    }else if (num == 2)_{
      return v2;
    }else {
      //assuming valid input of 1, 2, or 3
      return v3;
    }
  }
}
