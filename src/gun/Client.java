package gun;

public class Client {

	public static void main(String[] args) {
		Soldier s1 = new Soldier(); //ʿ��
		
		AbstractGun gun;
		
		//ʹ����ǹɱ��
		//gun = new HandGun(); //�������ͱ�����������,��̬
		
		//ʹ������ɱ��
		//gun = new Rifle();
		
		//ʹ�û�ǹɱ��
		gun = new MachineGun();
		
		s1.killEnemy(gun);
	}

}
