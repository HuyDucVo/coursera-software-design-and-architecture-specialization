CoffeeMachineInterface.java

public interface CoffeeMachineInterface {
	void chooseFirstSelection();
	void chooseSecondSelection();

}


OldCoffeeMachine.java

public class OldCoffeeMachine {
	void selectA();
	void selectB();




}






CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	OldCoffeeMachine ocm;
	CoffeeTouchscreenAdapter(OldCoffeeMachine ocm){
		this.ocm = ocm;
	}
	void chooseFirstSelection(){
		this.ocm.selectA();
	};
	void chooseSecondSelection(){
		this.ocm.selectB();
	};
}


CoffeeMachineInterface.java

public interface CoffeeMachineInterface {
	public void chooseFirstSelection();
	public void chooseSecondSelection();
}


OldCoffeeMachine.java

public class OldCoffeeMachine {

	public void selectA() {
		System.out.println(“A - Selected”);
	}
	Public void selectB() {
		System.out.println(“B - Selected”);
	}
}






CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCofffeeMachine theMachine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
		theMachine = newMachine;
	}
	
	public void chooseFirstSelection() {
		theMachine.selectA();
	}
	
	public void chooseSecondSelection() {
		theMachine.selectB();
}
}

