/*
 This program is the create a large transparent circle that contain 3 circle 
around it cicumfrence at random points thar are draggable and they are connected 
to each other creatinga traingle and showing it angles whenever dragging 
any of the three circle
 */
package atriangletest;


import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Line;

import javafx.scene.text.Text;

import javafx.stage.Stage;

import javafx.scene.layout.Pane;

import javafx.geometry.Point2D;

import static java.lang.Math.acos;

/**
 *
 * @author Raymond Jones,Gabriel Llanto,Vaneeza Asghar, David Ariyaratnam
 */
public class ATriangleTest extends Application{

   private Circle sm1, sm2, sm3;

   private Line line1, line2, line3;

   private Text txt1,txt2, txt3;

   double val1, val2, val3;
   
   double x ,y;

   Pane paneObject= new Pane();

 
    @Override

    public void start(Stage stage) throws Exception {


        //For Encompassing Circle

      Circle circle = new Circle(250, 250, 150);

        paneObject.getChildren().add(circle);

        circle.setFill(Color.TRANSPARENT);

        circle.setStroke(Color.BLACK);

 
        //Creating the small Circles

        sm1 = new Circle(105, 214,10);

        sm1.setFill(Color.RED);

        sm1.setStroke(Color.BLACK);
    

        sm2 = new Circle(395, 215,10);

        sm2.setFill(Color.RED);

        sm2.setStroke(Color.BLACK);


        sm3 = new Circle(260, 400,10);

        sm3.setFill(Color.RED);

        sm3.setStroke(Color.BLACK);

 
       //Creating the lines

        line1= new Line();

        line1.setFill(Color.BLACK);

        line1.setStroke(Color.BLACK);

 

        line2= new Line();

        line2.setFill(Color.BLACK);

        line2.setStroke(Color.BLACK);

    

        line3= new Line();

        line3.setFill(Color.BLACK);

        line3.setStroke(Color.BLACK);

  

       //Creating the text areas for the angles

        txt1= new Text();

        txt2= new Text();

        txt3= new Text();

         connect();

      
       

    // adds the small circles, lines and text to the pane  

    paneObject.getChildren().addAll(sm1);

    paneObject.getChildren().addAll(sm2);

    paneObject.getChildren().addAll(sm3);

    paneObject.getChildren().addAll(line1);

    paneObject.getChildren().addAll(line2);

    paneObject.getChildren().addAll(line3);

    paneObject.getChildren().addAll(txt1);

    paneObject.getChildren().addAll(txt2);

    paneObject.getChildren().addAll(txt3);

             

   //Dragging the small circle 
     sm3.setOnMouseDragged(e->{

    double radValue = Math.atan2(e.getY()-circle.getCenterY(),e.getX()-circle.getCenterX());

     double x = circle.getCenterX()+circle.getRadius()*Math.cos(radValue);

     double y = circle.getCenterY()+circle.getRadius()*Math.sin(radValue);

     sm3.setCenterX(x);

     sm3.setCenterY(y);

       connect();

       });

    
    //Dragging the small circle 
       sm2.setOnMouseDragged(e->{

     double radValue = Math.atan2(e.getY()-circle.getCenterY(),e.getX()-circle.getCenterX());

     double x = circle.getCenterX()+ circle.getRadius()*Math.cos(radValue);

     double y = circle.getCenterY()+circle.getRadius()*Math.sin(radValue);

     sm2.setCenterX(x);

     sm2.setCenterY(y);

       connect();

     

       });

       //Dragging the small circle 
       
          sm1.setOnMouseDragged(e->{

     double radValue = Math.atan2(e.getY()-circle.getCenterY(),e.getX()-circle.getCenterX());

     double x = circle.getCenterX()+circle.getRadius()*Math.cos(radValue);

     double y = circle.getCenterY()+circle.getRadius()*Math.sin(radValue);

     sm1.setCenterX(x);

     sm1.setCenterY(y);

       connect();

     });

     
        /*Creates the Scene*/

             

       stage.setScene(new Scene (paneObject,500,500));

 

        /*Outputs the stage*/

        stage.show();

      

    }

    
    // Places the created lines inbetween circles, does the math to claculate angles, and places the text objects to show angles

     private void connect() {

                line1.setStartX(sm1.getCenterX());

                line1.setStartY(sm1.getCenterY());

                line1.setEndX(sm2.getCenterX());

                line1.setEndY(sm2.getCenterY());

                line2.setStartX(sm1.getCenterX());
        
                line2.setStartY(sm1.getCenterY());

                line2.setEndX(sm3.getCenterX());

                line2.setEndY(sm3.getCenterY());

                line3.setStartX(sm2.getCenterX());

                line3.setStartY(sm2.getCenterY());

                line3.setEndX(sm3.getCenterX());

                line3.setEndY(sm3.getCenterY());

         
               double a = new Point2D(sm3.getCenterX(), sm3.getCenterY()).

                    distance(sm2.getCenterX(), sm2.getCenterY());

                

                double b = new Point2D(sm3.getCenterX(), sm3.getCenterY()).

                    distance(sm1.getCenterX(), sm1.getCenterY());

               

               double c = new Point2D(sm2.getCenterX(), sm2.getCenterY()).

                    distance(sm1.getCenterX(), sm1.getCenterY());

             
                val1 = acos((a * a - b * b - c * c) / (-2 * b * c));

                val2 = acos((b * b - a * a - c * c) / (-2 * a * c));

                val3 = acos((c * c - b * b - a * a) / (-2 * a * b));

                txt1.setX(sm1.getCenterX());

                txt1.setY(sm1.getCenterY()-10);

                txt1.setText(String.format("%.2f", Math.toDegrees(val1)));

                txt2.setX(sm2.getCenterX());

                txt2.setY(sm2.getCenterY()-10);

                txt2.setText(String.format("%.2f", Math.toDegrees(val2)));

                txt3.setX(sm3.getCenterX());

                txt3.setY(sm3.getCenterY()-10);

                txt3.setText(String.format("%.2f", Math.toDegrees(val3)));


     }

 
     public static void main(String[] args) {

 

        launch(args);

 

    }

}
