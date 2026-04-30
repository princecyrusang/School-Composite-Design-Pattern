import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> children = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        children.add(unit);
    }

    @Override
    public void getDetails() {
        System.out.println("College: " + name);
        for (EducationalUnit unit : children) {
            unit.getDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : children) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for (EducationalUnit unit : children) {
            budget += unit.getBudget();
        }
        return budget;
    }
}
