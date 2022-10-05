package Practice1;

public class Ders5_boolean_ve_if_muhtesem {
    public static void main(String[] args) {

        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if(passedDoor) {  //missedDoor yaparsan false olcak ve kazanamicaksin
            System.out.println("We passed the first door!");
            doorCount = doorCount + 1;
        }

        if(passedDoor) {
            System.out.println("We passed the second door!");
            doorCount = doorCount + 1;
        }

        if(passedDoor) {
            System.out.println("We passed the third door!");
            doorCount = doorCount + 1;
        }

        if(doorCount == 3) {
            passedAllDoors = true;
        }

        if(passedAllDoors) {
            System.out.println("Congratulations you won the program!");
        }
    }
}
