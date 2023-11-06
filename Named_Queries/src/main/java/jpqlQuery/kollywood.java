package jpqlQuery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@NamedQueries({ @NamedQuery(name = "IdentifyByName", query = "from kollywood k where k.ActorName=:ActorName") })
@Entity
public class kollywood {
	@Id
	private int ActorId;
	private String ActorName;
	private Double salary;

	public int getActorId() {
		return ActorId;
	}

	@Override
	public String toString() {
		return "kollywood [ActorId=" + ActorId + ", ActorName=" + ActorName + ", salary=" + salary + "]";
	}

	public void setActorId(int actorId) {
		ActorId = actorId;
	}

	public String getActorName() {
		return ActorName;
	}

	public void setActorName(String actorName) {
		ActorName = actorName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
