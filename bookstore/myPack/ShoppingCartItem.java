package myPack;
/*��װ���ﳵ��ÿһ����Ŀ�����������Ϣ�Լ��������*/
public class ShoppingCartItem {
	
	private Object item=null;
	private int quantity=0;
	
	public ShoppingCartItem(Object obj){
		item=obj;
		quantity=1;
	}
	
	public void incrementQuantity(){
		quantity++;
	}
	
	public void decrementQuantity(){
		quantity--;
	}
	
	public int getQuantity(){
		return quantity;
	}

	public Object getItem(){
		return item;
	}
}
