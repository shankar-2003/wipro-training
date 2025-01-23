package com.wiprotraining;

public class EncapEx {
    class Person {
        private String name;
        private int age;

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for age
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                System.out.println("Age cannot be negative. Setting age to 0 by default.");
                this.age = 0;
            } else {
                this.age = age;
            }
        }

        // Method to check voting eligibility
        public String checkVotingEligibility() {
            return (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        }
    }

    public static void main(String[] args) {
        // Outer class instance to access inner class
        EncapEx outer = new EncapEx();
        Person person = outer.new Person();

        // Set name and age
        person.setName("John");
        person.setAge(20);

        // Display name and voting eligibility
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Voting Eligibility: " + person.checkVotingEligibility());

        // Test with age below 18
        person.setAge(16);
        System.out.println("\nName: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Voting Eligibility: " + person.checkVotingEligibility());
    }
}
