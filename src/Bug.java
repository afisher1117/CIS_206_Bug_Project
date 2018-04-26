import java.util.Scanner;

class Bug
{
    private int currentX;
    private int currentY;
    private String bugDirection;
    
    public Bug(int initialX, int initialY){
        currentX = initialX;
        currentY = initialY;
        bugDirection = "to the right";
    }
    
    public void bugMenu(){
        
        System.out.println("Hello! You are now in control of a bug.");
        System.out.println("He is facing " + bugDirection + " and is at position (" + currentX + "," + currentY + ")");
        System.out.println("What would you like it to do?");
        System.out.println("It can do the following things: ");
        System.out.println("Move forward, turn to the right, or turn to the left");
        System.out.println("");
        bugChoices();
    }
    
    public void bugChoices(){
        System.out.println("Make your choice now (type in 'right' to go right, 'left' to go left' or 'move' to move forward or type 'quit' to quit) : ");
        String choice = in.nextLine();
        bugSwitch(choice);
        bugChoices();
    }
    
    public void bugSwitch(String c){
        
        switch(c){
            case "right":
                bugTurnRight();
                break;
            case "left":
                bugTurnLeft();
                break;
            case "move":
                bugMove();
                break;
            case "quit":
                System.exit(0);
        }
    }
    
    public void bugTurnRight(){
        if(bugDirection.equals("Upwards")){
            bugDirection = "to the right";
        }
        else if(bugDirection.equals("to the right")){
            bugDirection = "Downwards";
        }
        else if(bugDirection.equals("Downwards")){
            bugDirection = "to the left";
        }
        else if(bugDirection.equals("to the left")){
            bugDirection = "Upwards";
        }
        System.out.println("Adam Ant is now facing " + getDirection());
    }
    
    public void bugTurnLeft(){
        if(bugDirection.equals("Upwards")){
            bugDirection = "to the left";
        }
        else if(bugDirection.equals("to the left")){
            bugDirection = "Downwards";
        }
        else if(bugDirection.equals("Downwards")){
            bugDirection = "to the right";
        }
        else if(bugDirection.equals("to the right")){
            bugDirection = "Upwards";
        }
        System.out.println("Adam Ant is now facing " + getDirection());
    }
    
    public void bugMove(){
        if(bugDirection.equals("Upwards")){
            currentY = currentY + 1;
        }
        else if(bugDirection.equals("to the right")){
            currentX = currentX + 1;
        }
        else if(bugDirection.equals("to the left")){
            currentX = currentX - 1;
        }
        else if(bugDirection.equals("Downwards")){
            currentY = currentY - 1;
        }
        System.out.println("Adam Ant has moved to (" + getX() + "," + getY() +")");
    }
    
    public int getX(){
        return currentX;
    }
    
    public int getY(){
        return currentY;
    }
    
    public String getDirection(){
        return bugDirection;
    }
    
    public Scanner in = new Scanner(System.in);
}
