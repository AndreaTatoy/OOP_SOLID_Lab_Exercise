public class Pet implements PetSound, PetFood {
    private String petName;
    private String owner;

    public Pet (String petName, String owner){
        this.petName = petName;
        this.owner = owner;
    }

    public String makeSound(){
        return sound;
    }

    public String eat(){
        return eat;
    }
}