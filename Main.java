/* 
Zachery Allen
CIS221 
T & Th 2:10pm 
*/

//Abstract class declaring my favorite genre
abstract class Music{
    //abstract method used in Bands class
    public abstract void bands();
    //static method stating my fav genre
    public static void favGenre(){
        System.out.println("My favorite genre of music is Prog Rock.");
    }
}
//Bands class being used to extend Music and elaborate on the abstract bands method
class Bands extends Music{
    //Fills and prints a string with a list of a few of my favorite bands
    public void bands(){
        String[] someBands = {"Rush","Thank You Scientist","Muse","The Mars Volta"};
        System.out.println("Some bands I like are: ");
        //For each band in the array someBands, print the bands name
        for (String i : someBands){
            System.out.println(i);
        }
    }
}

//Main class
class Main{
    public static void main(String[] args){
        //Create object of Bands class
        Bands myBands = new Bands();
        //Can call the static method from abstract class Music using the Bands object
        myBands.favGenre();
        //List the bands from the Bands class
        myBands.bands();
    }
}