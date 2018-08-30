package colonia.model;

public abstract class AbstractOrganism {
	private boolean alive = true;
	private boolean active = false;
	private String name;

	private String currentjob;

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentjob() {
		return currentjob;
	}

	public void setCurrentjob(String currentjob) {
		this.currentjob = currentjob;
	}

	@Override
	public String toString() {
		return "AbstractOrganism [alive=" + alive + ", active=" + active
				+ ", name=" + name + "]";
	}

}
