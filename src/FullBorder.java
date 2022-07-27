
public class FullBorder extends Border {

	protected FullBorder(final Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return 1 + m_display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return 1 + m_display.getRows() + 1;
	}

	@Override
	public String getRowText(final int row) {
		if(row == 0) return "+" + makeLine('-',m_display.getColumns()) + '+';
		else if(row == m_display.getRows() + 1) return "+" + makeLine('-',m_display.getColumns()) + "+";
		else return "|" + m_display.getRowText(row - 1) + "|";
		
		}
	
	//文字chをcount個連続させた文字列を作成する
	private String makeLine(final char ch,final int count) {
		final StringBuilder line = new StringBuilder();
		for(int i = 0; i < count; i++) {
			line.append(ch);
		}
		return line.toString();
	}
}
