public class Zoo {

    public Animal[] animals = new Animal[25];
    public String name;
    public String city;
    public int nbCage;
    public int nbAnimal;

    public Zoo() {
        Animal[] animals1 = animals;
        animals1 = new Animal[25];
    }


    public Zoo(String name, String city, int nbCage){
        this.name = name;
        this.city = city;
        this.nbCage = nbCage;
        //this.animals = new Animal[25];
        animals = new Animal[nbCage];
    }


    public void displayZoo(){
        System.out.println("Name" + name + " city" + city + " nbrcage" + nbCage + " nbanimal" + nbAnimal );

        for (int i=0 ; i<animals.length ; i++) {



            if (animals[i] != null) {
                System.out.println(animals[i].name+","+animals[i].age);
            }
            else break ;
        }
    }
    public void displayZoo2() {
        System.out.println("Name" + name + " city" + city + " nbrcage" + nbCage + " nbanimal" + nbAnimal);

        for (int i = 0; i < nbAnimal; i++) {

        }
    }

    public void ajouterAnimal ( Animal animal){
        if(nbAnimal < animals.length){
            animals[nbAnimal] = animal;
            nbAnimal++ ;
        }
    }
    public String toString(){
        String ch1 = name + city + nbCage ;
        String ch2 ="";
        for (int i = 0; i < nbAnimal; i++) {

            ch2 = ch2 + animals[i] + "\n";

        }


        return ch1+ch2;
    }
}