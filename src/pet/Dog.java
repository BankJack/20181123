package pet;

public class Dog extends Pet{

	private String strain;
	
	public Dog() {
		super();
	}

	public Dog(String name, int health, int love,String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}


	public void setStrain(String strain) {
		this.strain = strain;
	}


	@Override
	public void print() {
		System.out.println("�ǳƣ�" + super.getName() + ",�����ȣ�" + super.getHealth() + ",���ܶȣ�" + super.getLove() + ",Ʒ�֣�" + this.strain);
	}

}
