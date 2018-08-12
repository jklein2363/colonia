package colonia.model;

public class Ant extends AbstractOrganism {
	public Ant(boolean active) {
		this.setActive(active);
	}

	/**
	 * Overrides toString method
	 * @return unicode Ant icon plus name
	 */
	@Override
	public String toString() {

		return "\uD83D\uDC1C" + " " + this.getName();
	}
}
