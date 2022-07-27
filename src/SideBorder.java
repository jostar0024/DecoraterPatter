
public class SideBorder extends Border {
	private char m_borderChar;//飾りの文字
	
	//中身となるDisplayと飾り文字を指定
	public SideBorder(final Display display, final char ch) {
		super(display);
		m_borderChar = ch;
	}

	@Override
	public int getColumns() {
		//文字数は中身の両側に飾り文字分を加えたもの
		return 1 + m_display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		//桁数は中身と同じ
		return m_display.getRows();
	}

	@Override
	public String getRowText(final int row) {
		//指定行の内容は、中身の指定行の両側に飾り文字をつけたもの
		return m_borderChar + m_display.getRowText(row) + m_borderChar;
	}
	
	

}
