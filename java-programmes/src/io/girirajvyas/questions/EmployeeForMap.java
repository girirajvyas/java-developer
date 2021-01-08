package io.girirajvyas.questions;

public class EmployeeForMap {
	int id, age;

    public EmployeeForMap(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return id + age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == ((EmployeeForMap) obj).hashCode();
    }

    public String toString() {
        return this.id + " : " + this.age;
    }
}
