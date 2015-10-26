import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);
      
      final MoveableShape shape2
            = new CarShape(100, 10, CAR_WIDTH);
      
      final MoveableShape shape3
                = new CarShape(10, 50, CAR_WIDTH);

      ArrayList<MoveableShape> shapeList = new ArrayList<MoveableShape>() ;
      
      shapeList.add(shape);
      shapeList.add(shape2);
      shapeList.add(shape3);
              
      ShapeIcon icon = new ShapeIcon(shapeList,
            ICON_WIDTH, ICON_HEIGHT);
      
      /*ShapeIcon icon2 = new ShapeIcon(shape2,
            ICON_WIDTH, ICON_HEIGHT);
      
      ShapeIcon icon3 = new ShapeIcon(shape3,
            ICON_WIDTH, ICON_HEIGHT);*/

      final JLabel label = new JLabel(icon);
      frame.setLayout(new FlowLayout());
      frame.add(label);
      
      /*final JLabel label2 = new JLabel(icon2);
      frame.setLayout(new FlowLayout());
      frame.add(label2);
      
      final JLabel label3 = new JLabel(icon3);
      frame.setLayout(new FlowLayout());
      frame.add(label3);*/

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 100;
      // Milliseconds between timer ticks
      javax.swing.Timer t = new javax.swing.Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
                for (MoveableShape shape : shapeList) {
               shape.translate(1, 0);
               label.repaint();
                }
              
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
