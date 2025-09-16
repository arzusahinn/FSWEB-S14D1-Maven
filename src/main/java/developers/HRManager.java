package com.workintech.developers;

public class HRManager extends Employee {

    private String department;
    private int level;
    private double bonus;

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        // Basit default değerler
        this.department = "General";
        this.level = 1;
        this.bonus = 0;
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    public void addEmployee(JuniorDeveloper junior) {
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("JuniorDeveloper array is full! Cannot add " + junior.getName());
        }
    }

    // addEmployee overload: Mid
    public void addEmployee(MidDeveloper mid) {
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("MidDeveloper array is full! Cannot add " + mid.getName());
        }
    }

    // addEmployee overload: Senior
    public void addEmployee(SeniorDeveloper senior) {
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("SeniorDeveloper array is full! Cannot add " + senior.getName());
        }
    }

    // Getter diziler
    public JuniorDeveloper[] getJuniorDevelopers() { return juniorDevelopers; }
    public MidDeveloper[] getMidDevelopers() { return midDevelopers; }
    public SeniorDeveloper[] getSeniorDevelopers() { return seniorDevelopers; }
}