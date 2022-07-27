
public abstract class Border extends Display {
	protected Display m_display; //飾り枠が包んでいる中身
	protected Border(final Display display) {
		m_display = display;
	}
}
