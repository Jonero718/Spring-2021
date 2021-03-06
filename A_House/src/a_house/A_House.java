
package a_house;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class A_House extends Application{

    
    public static void main(String[] args) {
     
        
        
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
      //  Button btn1 = new Button ("click me");
      //  btn1.setLayoutX(100); btn1.setLayoutY(100);
      
      
 //Building      
 
 Polygon topRoof = new Polygon(79,153, 701,153,388,0);
 topRoof.setFill(Color.WHITE);
 topRoof.setStrokeWidth(1);
      topRoof.setStroke(Color.BLACK);
 
 
      Rectangle btmRoof = new Rectangle (117,153,546,32);
      btmRoof.setFill(Color.WHITE);
      btmRoof.setStrokeWidth(1);
      btmRoof.setStroke(Color.BLACK);
      
      Rectangle buildingWall = new Rectangle (117,153,546,466);
      buildingWall.setFill(Color.BROWN);
      buildingWall.setStrokeWidth(1);
      buildingWall.setStroke(Color.BLACK);
      
      
 //Left door with windows 
      Rectangle buildingDoor1 = new Rectangle (193,334,77,151);
      buildingDoor1.setFill(Color.WHITE);
      buildingDoor1.setStrokeWidth(1);
      buildingDoor1.setStroke(Color.BLACK);
      
      Rectangle leftDoorWindow1 = new Rectangle (210,342,15,15);
      leftDoorWindow1.setFill(Color.BLACK);
      
      Rectangle leftDoorWindow2 = new Rectangle (240,342,15,15);
      leftDoorWindow2.setFill(Color.BLACK);
      
      Rectangle leftDoorWindow3 = new Rectangle (210,365,15,23);
      leftDoorWindow3.setFill(Color.BLACK);
      
       Rectangle leftDoorWindow4 = new Rectangle (210,395,15,23);
      leftDoorWindow4.setFill(Color.BLACK);
      
       Rectangle leftDoorWindow5 = new Rectangle (210,425,15,23);
      leftDoorWindow5.setFill(Color.BLACK);
      
       Rectangle leftDoorWindow6 = new Rectangle (210,456,15,23);
      leftDoorWindow6.setFill(Color.BLACK);
      
       Rectangle leftDoorWindow7 = new Rectangle (240,365,15,23);
      leftDoorWindow7.setFill(Color.BLACK);
      
       Rectangle leftDoorWindow8 = new Rectangle (240,395,15,23);
      leftDoorWindow8.setFill(Color.BLACK);
      
       Rectangle leftDoorWindow9 = new Rectangle (240,425,15,23);
      leftDoorWindow9.setFill(Color.BLACK);
      
       Rectangle leftDoorWindow10 = new Rectangle (240,456,15,23);
      leftDoorWindow10.setFill(Color.BLACK);
      
      
 //Middle Door with windows     
 Rectangle windowOverDoor = new Rectangle (350,215,77,43);
 windowOverDoor.setFill(Color.GRAY);
  windowOverDoor.setStrokeWidth(1);
      windowOverDoor.setStroke(Color.BLACK);
 
      Rectangle buildingDoor2 = new Rectangle (350,305,77,181);
      buildingDoor2.setFill(Color.WHITE);
      buildingDoor2.setStrokeWidth(1);
      buildingDoor2.setStroke(Color.BLACK);
      
        Rectangle midDoorWindow1 = new Rectangle (365,342,15,15);
      midDoorWindow1.setFill(Color.BLACK);
      
      Rectangle midDoorWindow2 = new Rectangle (396,342,15,15);
      midDoorWindow2.setFill(Color.BLACK);
      
      Rectangle midDoorWindow3 = new Rectangle (365,365,15,23);
      midDoorWindow3.setFill(Color.BLACK);
      
       Rectangle midDoorWindow4 = new Rectangle (365,395,15,23);
      midDoorWindow4.setFill(Color.BLACK);
      
       Rectangle midDoorWindow5 = new Rectangle (365,425,15,23);
      midDoorWindow5.setFill(Color.BLACK);
      
       Rectangle midDoorWindow6 = new Rectangle (365,456,15,23);
      midDoorWindow6.setFill(Color.BLACK);
      
       Rectangle midDoorWindow7 = new Rectangle (396,365,15,23);
      midDoorWindow7.setFill(Color.BLACK);
      
       Rectangle midDoorWindow8 = new Rectangle (396,395,15,23);
      midDoorWindow8.setFill(Color.BLACK);
      
       Rectangle midDoorWindow9 = new Rectangle (396,425,15,23);
      midDoorWindow9.setFill(Color.BLACK);
      
       Rectangle midDoorWindow10 = new Rectangle (396,456,15,23);
      midDoorWindow10.setFill(Color.BLACK);
      
 //Right Door with windows     
      Rectangle buildingDoor3 = new Rectangle (506,334,77,151);
      buildingDoor3.setFill(Color.WHITE);
      buildingDoor3.setStrokeWidth(1);
      buildingDoor3.setStroke(Color.BLACK);
      
        Rectangle rightDoorWindow1 = new Rectangle (520,342,15,15);
      rightDoorWindow1.setFill(Color.BLACK);
      
      Rectangle rightDoorWindow2 = new Rectangle (552,342,15,15);
      rightDoorWindow2.setFill(Color.BLACK);
      
      Rectangle rightDoorWindow3 = new Rectangle (520,365,15,23);
      rightDoorWindow3.setFill(Color.BLACK);
      
       Rectangle rightDoorWindow4 = new Rectangle (520,395,15,23);
      rightDoorWindow4.setFill(Color.BLACK);
      
       Rectangle rightDoorWindow5 = new Rectangle (520,425,15,23);
      rightDoorWindow5.setFill(Color.BLACK);
      
       Rectangle rightDoorWindow6 = new Rectangle (520,456,15,23);
      rightDoorWindow6.setFill(Color.BLACK);
      
       Rectangle rightDoorWindow7 = new Rectangle (552,365,15,23);
      rightDoorWindow7.setFill(Color.BLACK);
      
       Rectangle rightDoorWindow8 = new Rectangle (552,395,15,23);
      rightDoorWindow8.setFill(Color.BLACK);
      
       Rectangle rightDoorWindow9 = new Rectangle (552,425,15,23);
      rightDoorWindow9.setFill(Color.BLACK);
      
       Rectangle rightDoorWindow10 = new Rectangle (552,456,15,23);
      rightDoorWindow10.setFill(Color.BLACK);
      
      
//Pillars
      Rectangle pillar1 = new Rectangle (132,183, 46, 287);
      pillar1.setFill(Color.WHITE);
      pillar1.setStrokeWidth(1);
      pillar1.setStroke(Color.BLACK);
           
      Rectangle pillar2 = new Rectangle (289,183, 46, 287);
      pillar2.setFill(Color.WHITE);
      pillar2.setStrokeWidth(1);
      pillar2.setStroke(Color.BLACK);
                
      Rectangle pillar3 = new Rectangle (443,183, 46, 287);
      pillar3.setFill(Color.WHITE);
      pillar3.setStrokeWidth(1);
      pillar3.setStroke(Color.BLACK);
               
      Rectangle pillar4 = new Rectangle (600,183, 46, 287);
      pillar4.setFill(Color.WHITE);
      pillar4.setStrokeWidth(1);
      pillar4.setStroke(Color.BLACK);
      
// Pillar bottoms 
      Rectangle pillarBtm1 = new Rectangle (122,469, 63, 16);
      pillarBtm1.setFill(Color.WHITE);
      pillarBtm1.setStrokeWidth(1);
      pillarBtm1.setStroke(Color.BLACK);
      
      Rectangle pillarBtm2 = new Rectangle (280,469, 63, 16);
      pillarBtm2.setFill(Color.WHITE);
      pillarBtm2.setStrokeWidth(1);
      pillarBtm2.setStroke(Color.BLACK);

      Rectangle pillarBtm3 = new Rectangle (436,469, 63, 16);
      pillarBtm3.setFill(Color.WHITE);
      pillarBtm3.setStrokeWidth(1);
      pillarBtm3.setStroke(Color.BLACK);

      Rectangle pillarBtm4 = new Rectangle (591,469, 63, 16);
      pillarBtm4.setFill(Color.WHITE);
      pillarBtm4.setStrokeWidth(1);
      pillarBtm4.setStroke(Color.BLACK);
      
//steps
      Rectangle pillarStep1 = new Rectangle (117,485, 68, 8);
      pillarStep1.setFill(Color.GRAY);
      pillarStep1.setStrokeWidth(1);
      pillarStep1.setStroke(Color.BLACK);
      
      Rectangle pillarStep2 = new Rectangle (591,485, 72, 8);
      pillarStep2.setFill(Color.GRAY);
      pillarStep2.setStrokeWidth(1);
      pillarStep2.setStroke(Color.BLACK);
      
      Rectangle step1 = new Rectangle (185,485, 406, 13);
      step1.setFill(Color.GRAY);
      step1.setStrokeWidth(1);
      step1.setStroke(Color.BLACK);
      
      Rectangle step2 = new Rectangle (175,498, 430, 13);
      step2.setFill(Color.GRAY);
      step2.setStrokeWidth(1);
      step2.setStroke(Color.BLACK);
              
      Rectangle step3 = new Rectangle (163,511, 455, 13);
      step3.setFill(Color.GRAY);
      step3.setStrokeWidth(1);
      step3.setStroke(Color.BLACK);
              
      Rectangle step4 = new Rectangle (150,523, 478, 13);
      step4.setFill(Color.GRAY);
      step4.setStrokeWidth(1);
      step4.setStroke(Color.BLACK);
              
      Rectangle step5 = new Rectangle (138,536, 504, 13);
      step5.setFill(Color.GRAY);
      step5.setStrokeWidth(1);
      step5.setStroke(Color.BLACK);
              
      Rectangle step6 = new Rectangle (124,547, 529, 13);
      step6.setFill(Color.GRAY);
      step6.setStrokeWidth(1);
      step6.setStroke(Color.BLACK);
      
      Rectangle step7 = new Rectangle (112,559, 553, 13);
      step7.setFill(Color.GRAY);
      step7.setStrokeWidth(1);
      step7.setStroke(Color.BLACK);
              
      Rectangle step8 = new Rectangle (100,571, 577, 13);
      step8.setFill(Color.GRAY);
      step8.setStrokeWidth(1);
      step8.setStroke(Color.BLACK);
              
      Rectangle step9 = new Rectangle (88,584, 604, 13);
      step9.setFill(Color.GRAY);
      step9.setStrokeWidth(1);
      step9.setStroke(Color.BLACK);
              
      Rectangle step10 = new Rectangle (75,596, 629, 13);
      step10.setFill(Color.GRAY);
      step10.setStrokeWidth(1);
      step10.setStroke(Color.BLACK);
              
      Rectangle step11 = new Rectangle (62,607, 654, 13);
      step11.setFill(Color.GRAY);
      step11.setStrokeWidth(1);
      step11.setStroke(Color.BLACK);
      
      
// Pillar tops      
        Circle tops1 = new Circle (132, 198, 15);
        
        Circle tops2 = new Circle (179, 198, 15);
        Circle tops3 = new Circle (289, 198, 15);
        Circle tops4 = new Circle (336, 198, 15);
        Circle tops5 = new Circle (443, 198, 15);
        Circle tops6 = new Circle (490, 198, 15);
        Circle tops7 = new Circle (600, 198, 15);
        Circle tops8 = new Circle (648, 198, 15);
        
        
        
        
        
        
     // Grass
     Rectangle grass = new Rectangle (0,305,749,387 );
     grass.setFill(Color.GREEN);
     
     
     
     
     // Created groups depending on different parts of the house
     
      Group steps = new Group (pillarStep1, pillarStep2,step1,step2,step3,step4,step5,step6,step7,step8,step9,step10,step11);
      Group building = new Group (buildingWall,buildingDoor1,buildingDoor2,buildingDoor3,windowOverDoor,leftDoorWindow1,leftDoorWindow2,leftDoorWindow3,leftDoorWindow4,leftDoorWindow5,
              leftDoorWindow6,leftDoorWindow7,leftDoorWindow8,leftDoorWindow9,leftDoorWindow10,midDoorWindow1,midDoorWindow2,midDoorWindow3,midDoorWindow4,midDoorWindow5,
              midDoorWindow6,midDoorWindow7,midDoorWindow8,midDoorWindow9,midDoorWindow10,rightDoorWindow1,rightDoorWindow2,rightDoorWindow3,rightDoorWindow4,rightDoorWindow5,
              rightDoorWindow6,rightDoorWindow7,rightDoorWindow8,rightDoorWindow9,rightDoorWindow10);
        Group roof = new Group (topRoof, btmRoof);
        Group tops = new Group(tops1,tops2,tops3,tops4,tops5,tops6,tops7,tops8);
        Group pillars = new Group (pillar1,pillar2,pillar3,pillar4,pillarBtm1,pillarBtm2,pillarBtm3,pillarBtm4);
     
    // Created a group called house for layering
        Group house = new Group(grass, building,pillars,steps,tops,roof);
        
        
        Scene sn = new Scene(house, 749, 691, Color.LIGHTBLUE);
        
        stage.setScene(sn);
        stage.setTitle("A House");
        stage.show();
       
    }
    
}
