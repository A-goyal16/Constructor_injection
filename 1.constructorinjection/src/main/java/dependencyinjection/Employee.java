package dependencyinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	int id;
	String name;

	public Employee(@Value("01") int id,@Value("Ayushi") String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
