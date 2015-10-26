import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
   An icon that contains a moveable shape.
*/
public class ShapeIcon implements Icon
{
  /*public ShapeIcon(MoveableShape shape,
      int width, int height)
   {
      this.shape = shape;
      this.width = width;
      this.height = height;
   }*/
   
      public ShapeIcon(ArrayList<MoveableShape> shapeArray, int width, int height)
   {
      this.shapeArray = shapeArray;
      this.width = width;
      this.height = height;
   }
   
   public int getIconWidth()
   {
      return width;
   }

   public int getIconHeight()
   {
      return height;
   }

   public void paintIcon(Component c, Graphics g, int x, int y)
   {
      Graphics2D g2 = (Graphics2D) g;
      for (MoveableShape shape : shapeArray) {
      shape.draw(g2);
      }
   }

   private int width;
   private int height;
   private ArrayList<MoveableShape> shapeArray;
}
