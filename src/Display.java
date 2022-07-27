
public abstract class Display {
	public abstract int getColumns();
	public abstract int getRows();
	public abstract String getRowText(final int row);
	
	//全ての行を表示する
	public void show() {
		for(int i = 0 ; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
