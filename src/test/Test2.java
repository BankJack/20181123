package test;

import pet.Dog;

public class Test2 {

	public static void main(String[] args) {
		/*Dog dog = new Dog("��ë",100,100,"��ëѲ��Ȯ");
		
		dog = new Dog(); //dog������ڴ��ַ�����˸ı�
		*/
		final Dog dog = new Dog("��ë",100,100,"��ëѲ��Ȯ");
		
		//dog�Ķ����ʱ��һ���������ö�����ڴ��ַ�����޸�
		
		//dog���������ֵ���Ը���
		dog.setName("ŷŷ");
		dog.setHealth(80);
		dog.setLove(90);
		System.out.println(dog.toString());
	}

}
