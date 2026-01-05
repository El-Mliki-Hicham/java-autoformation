import java.util.ArrayList;

public class MagazineLibrary {
    
    ArrayList<Magazine> Magazines ; 


    public MagazineLibrary(){
    this.Magazines  =new  ArrayList<>();
    }

    public Magazine getMagazine(int i){
    if (this.Magazines.size() == 0) {
        throw new IllegalArgumentException("the list of the magazines is Empty");
    }
    Magazine magazine = new Magazine(this.Magazines.get(i)) ;
        return magazine;
    }


    public  void setMagazine(int i, Magazine magazine){
 if (this.Magazines.size() == 0) {
        throw new IllegalArgumentException("the list of the magazines is Empty");
    }

     this.Magazines.set(i, new Magazine(magazine));
    }


    public void addMagazine(Magazine newMagazine){
        this.Magazines.add(new Magazine(newMagazine));
    }



}
