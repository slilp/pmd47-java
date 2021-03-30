package Homework_14;

public class OfficeCleaner extends Employee {
	
	
	public OfficeCleaner(String firstnameInput , String lastnameInput , int salaryInput) {
		super(firstnameInput,lastnameInput,salaryInput);
	}

	public void clean() {
		System.out.println("I cleaning");
	}
	
	public void killCoachroach() {
		System.out.println("killCoachroach");
	}
	
	public void decorateRoom() {
		System.out.println("I decorate the room.");
	}
	
	public void welcomeGuest() {
		System.out.println("Welcome guest!");
	}
	
	
	public  void work() {
		clean();
		killCoachroach();
		decorateRoom();
		welcomeGuest();
	}
	
}
