package baitap.HasIsInheritance;

class GameShape {
    public void displayShape() {
        System.out.println("displaying shape");
    }
    // more code
}
class PlayerPiece extends GameShape {
    public void movePiece() {
        System.out.println("moving game piece");
    }
    // more code
}
class TilePiece extends GameShape {
    public void getAdjacent() {
        System.out.println("getting adjacent tiles");
    }
    // more code
}