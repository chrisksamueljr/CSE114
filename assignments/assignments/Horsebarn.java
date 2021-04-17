 class HorseBarn {

    /** The spaces in the barn. Each array element holds a reference to the horse
 
    * that is currently occupying the space. A null value indicates an empty space.
 
    */
    private Horse[] spaces;
    public HorseBarn(int size) {
        spaces = new Horse[size];
    }
    /** Returns the index of the space that contains the horse with the specified
 
     *  name.
 
     * Precondition: No two horses in the barn have the same name.
 
     * @param name the name of the horse to find
 
     * @return the index of the space containing the horse with the specified
 
     *      name;
 
     *      -1 if no horse with the specified name is in the barn.
 
     */
    public void add(Horse horse) {
         for(int i=0; i<spaces.length; i++) {
             if(spaces[i].getName().equals(horse.getName())) {
                 spaces[i] = null;
                 return;
             }
         }
     }
     // remove
     public void remove(Horse horse) {
        for(int i=0; i<spaces.length; i++) {
            if(spaces[i].getName().equals(horse.getName())) {
                spaces[i] = null;
                return;
            }
        }
     }
     public String toString() {
         String result = "";
         for(Horse horse: spaces)
            result += horse + " ";
        return result;
     }
    public int findHorseSpace(String name) { 
        for(int i = 0; i < spaces.length; i++) {
            if(spaces[i].getName().equals(name))
                return i;
            return -1;
        }
        return 0;
    }
 
     
    public void consolidate()
    { 
        Horse[] newSpaces = new Horse[spaces.length];
        int j = 0;
        for(Horse horse: spaces) {
            if(horse!= null) {

            }
        }

    }   
    
    public static void main(String[] args) {
        HorseBarn horsebarn = new HorseBarn(10);
        horsebarn.add(new Horse("Abe", 100));
        horsebarn.add(new Horse("Bob", 100));
        horsebarn.add(new Horse("Cain", 100));
        horsebarn.add(new Horse("Dan", 100));
        System.out.println(horsebarn);
        horsebarn.remove(new Horse("Abe", 100));
        System.out.println(horsebarn);
        horsebarn.consolidate();
        System.out.println(horsebarn);
              
    }
 }