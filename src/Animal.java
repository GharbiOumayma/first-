public class Animal {
    public String family;
    public static String name;
    public int age;
    public boolean isMamal;
    public Animal(String familya, String namea, int agea, boolean isMamala) {
        family = familya;
        name = namea;
        age = agea;
        isMamal = isMamala;



    }
@Override // bch tjiblik decommantation ; redéfinition : andi il haq nbdel kn f comportement
    public String toString (){ // traj3lik des chaines de caractere
        return "family : "+family +"  name:"+name+"  age"+age;
    }

}