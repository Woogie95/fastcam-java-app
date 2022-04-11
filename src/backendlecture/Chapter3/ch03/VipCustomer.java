package backendlecture.Chapter3.ch03;

public class VipCustomer  extends Customer {

    double salesRatio;
    private String agentID;

    public VipCustomer() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentID() {
        return agentID;
    }
}
