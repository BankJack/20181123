package pet;

public class Penguin extends Pet {

	public Penguin() {
		super();
	}
	private char sex;  //������е�����
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	@Override
	public void print() {
		System.out.println("�ǳƣ�" + getName() + ",�����ȣ�" + getHealth() + ",���ܶȣ�" + getLove() + ",�Ա�" + this.sex);
	}
}
