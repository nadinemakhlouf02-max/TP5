package heritage;
public class Personne {
private String nom;
private int age;
private String telephone;
public Personne(String nom, int age,String telephone) {
this.nom = nom;
this.age = age;
this.telephone=telephone;
}
public String getNom() {
return nom;
}
public int getAge() {
return age;
}
public String getTelephone() {
	return telephone;
}
@Override
public String toString() {
return "Nom : " + nom 
		+ ", âge : " + age
		+ ", telephone: " + telephone;
}
}
//extend =perment a une classe fille d'heriter d'une classe mere 
//super permet d'appeler le constructeur de la classe mere 
//@indique que en redéfinit une methode a une classe mere 