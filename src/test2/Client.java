package test2;

public class Client {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b);
		
		//�������ͱ����������
		AbstractA a = b;
		//�Ƚ�a��b���ڴ��ַ�Ƿ���ͬ
		
		//==����Ϊ������������ʱ���Ƚϵ���ֵ�Ƿ���ͬ
		//==����Ϊ������������ʱ���Ƚϵ����ڴ��ַ�Ƿ���ͬ
		System.out.println(a == b);
		AbstractA a1 = new B();
		AbstractA a2 = new C();
		
		//�ж�a1�Ķ��������������   instanceof
		System.out.println(a1 instanceof C);  //�ж�a1�����������Ƿ�ΪC
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof AbstractA);
	}

}
