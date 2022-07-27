
public class StringDisplay extends Display {
	private final String m_string; //表示文字列
	public StringDisplay(final String string) {
		m_string = string; 
	}
	
	@Override
	public int getColumns() {
		return m_string.length();
	}

	@Override
	public int getRows() {
		return 1;
	}

	@Override
	public String getRowText(final int row) {
		if (row != 0) throw new IndexOutOfBoundsException();
		return m_string;
	}

}
