package core.person;

import java.text.Normalizer.Form;
import java.util.ArrayList;

public abstract class GeneralPerson {
protected int age;
protected String firstname;
protected String secondname;
protected String lastname;
protected ArrayList<Form> forms = new ArrayList<Form>();

public GeneralPerson(int age,Form[] hasforms){
	
}
}
