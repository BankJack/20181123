package pet;

/**
 * ������
 * �����಻�ܱ�ʵ����
 * �������п��԰���
 * 		���ԣ���ͨ���������󷽷������췽��
 * 		
 * @author Administrator
 *
 */
public abstract class Pet {

	/**
	 * �޲ι��췽��
	 */
	public Pet() {}
	
	/**
	 * �вι��췽��
	 * @param name �ǳ�
	 * @param health ����ֵ
	 * @param love	���ܶ�
	 */
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}

	private String name;
	private int health;
	private int love;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	
	/**
	 * ���󷽷�
	 * ���е�Pet�����������дprint����
	 * ��Ϊ��ͬ�������print������ʵ�ַ�ʽ��ͬ
	 * �������ṩ��print������ȫû��������
	 * ��˽�print������ȡΪ���󷽷�
	 */
	public abstract void print();
}
