package gun;

/**
 * ʿ����
 * @author Administrator
 *
 */
public class Soldier {
	/**
	 * ɱ���˵ķ���
	 */
	public void killEnemy(AbstractGun gun) {
		System.out.println("ʿ����ʼ���");
		gun.shoot();
	}
}
