package com.workintech.developers;

public class HRManager extends Employee {
    private final JuniorDeveloper[] juniorDevelopers;
    private final MidDeveloper[] midDevelopers;
    private final SeniorDeveloper[] seniorDevelopers;

    // Constructor
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5]; // Varsayılan değer
        this.midDevelopers = new MidDeveloper[5];       // Varsayılan değer
        this.seniorDevelopers = new SeniorDeveloper[5]; // Varsayılan değer
    }

    @Override
    public void work() {
        setSalary(getSalary() + 1500); // Maaş artışı
        System.out.println(getName() + " is an HR Manager and is now working. New salary: " + getSalary());
    }

    // Junior Developer ekleme metodu
    public void addJuniorDeveloper(JuniorDeveloper developer) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                System.out.println("Junior Developer added to the array at index " + i + ".");
                return;
            }
        }
        System.out.println("No space available for Junior Developer in the array. Employee not added.");
    }

    // Mid Developer ekleme metodu
    public void addMidDeveloper(MidDeveloper developer) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                System.out.println("Mid Developer added to the array at index " + i + ".");
                return;
            }
        }
        System.out.println("No space available for Mid Developer in the array. Employee not added.");
    }

    // Senior Developer ekleme metodu
    public void addSeniorDeveloper(SeniorDeveloper developer) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                System.out.println("Senior Developer added to the array at index " + i + ".");
                return;
            }
        }
        System.out.println("No space available for Senior Developer in the array. Employee not added.");
    }

    // Developer listelerini gösterme (Debugging amaçlı)
    public void showDevelopers() {
        System.out.println("Junior Developers:");
        for (JuniorDeveloper jd : juniorDevelopers) {
            if (jd != null) {
                System.out.println(jd.getName());
            }
        }

        System.out.println("Mid Developers:");
        for (MidDeveloper md : midDevelopers) {
            if (md != null) {
                System.out.println(md.getName());
            }
        }

        System.out.println("Senior Developers:");
        for (SeniorDeveloper sd : seniorDevelopers) {
            if (sd != null) {
                System.out.println(sd.getName());
            }
        }
    }
}
