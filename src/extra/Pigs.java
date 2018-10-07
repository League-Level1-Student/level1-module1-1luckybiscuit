package extra;

class Pig {

    private String Name;
    private boolean isSheepHerder;

    public Pig(String name, boolean canHerdSheep) {
         // write code here 
    		Name = name;
    		isSheepHerder = canHerdSheep;
   }
   public boolean willBecomeBacon() {
         if(this.isSheepHerder)
               return false;
         else return true;
   }
}