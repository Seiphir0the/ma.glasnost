package ma.glasnost.memoymodel;

public class Person {

	private String name;

	private Long age;

	private static Integer numberOfInstances = 0;

	public Person() {
		super();
		++numberOfInstances;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, Long age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getDescription(String yourName) {
		return new StringBuilder().append("my name is ").append(name)
				.append(" and my age is ").append(age)
				.append(" pleased to meet you ").append(yourName).toString();
	}

	public static final Integer numberOfInstance() {
		return numberOfInstances;
	}

}
