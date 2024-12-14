public class ZooMangement {
    public static void main (String [] args){
        Animal lion = new Animal("carnivore","lion",10,true );
        System.out.println(lion.name);
        System.out.println(lion.age);


        Animal chat= new Animal("carnivore","chat",5,true );
        System.out.println(chat.name);
        System.out.println(chat.age);
        System.out.println(chat.isMamal);


        Animal daulpin  = new Animal("carnivore","daulpin",2,true );
        System.out.println(daulpin.name);
        System.out.println(daulpin.age);
        System.out.println(daulpin.isMamal);


        Zoo myZoo = new Zoo("Zoo", "Tunis", 25);
        System.out.println(myZoo.animals.length);
        myZoo.animals[0] = lion ;
        myZoo.animals[1] = daulpin ;
        myZoo.displayZoo();
        myZoo.displayZoo2();
        myZoo.ajouterAnimal(lion);

        System.out.println(lion.toString());
        System.out.println("---------------------------");
        System.out.println(myZoo.toString());


    }

}