public class Prob1 {
    public static void main(String[] args) {
        double basicSalary = 105000; // Ramesh's basic salary
        double dearnessAllowance = 0.40 * basicSalary; // 40% of basic salary
        double houseRentAllowance = 0.20 * basicSalary; // 20% of basic salary

        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;

        System.out.println("Ramesh's Gross Salary: " + grossSalary);
    }
}
