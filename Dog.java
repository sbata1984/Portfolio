
public class Dog extends Animal{
	
	public Cat(String name, int age){
        super.setAge(age);;
        super.setName(name);
        super.setPositionX(0.0);
        super.setPositionY(0.0);

	public void pet(){
		System.out.println("Du streichelst " + super.getName());
		System.out.println(super.getName() + ": Wow Wow");
	}



	



}
