import java.util.Date;
public class Person {
public enum Sex {
MALE, FEMALE
}
String name;
Date birthday;
Sex gender;
String emailAddress;
int age;
public Person(String name, Sex gender) {
this.name = name;
this.gender = gender;
}
public int getAge() {
return age;
}
public String getName() {
return name;
}
public Sex getGender() {
return gender;
}
}
