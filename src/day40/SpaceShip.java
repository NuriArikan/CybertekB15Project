package day40;

public class SpaceShip {

    String name ;
    String currentDirection;  // EAST , WEST ,NORTH , SOUTH
    int xCoordinate ;
    int yCoordinate ;


    public void setInitialPosition ( int x , int y ) {

        xCoordinate = x;
        yCoordinate = y;
    }


    public void setDirection ( String direction) {

        if ( direction.equals("up") ||
                direction.equals("down") ||
                direction.equals("right") ||
                direction.equals("left") ){
            currentDirection = direction;
        } else {
            System.out.println("Invalid Direction");
            currentDirection = "" ;
        }


    }

    public void move1Block () {
        if ( currentDirection.equals("up")){
            yCoordinate+=1;
        }else if(currentDirection.equals("down")){
            yCoordinate-=1;
        }else if(currentDirection.equals("right")){
            xCoordinate+=1;
        }else if(currentDirection.equals("left")){
            xCoordinate-=1;
        }

    }
        // right click in your class anywhere
        // select generate
        // select toString --> Hit enter
        // Delete @override

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
