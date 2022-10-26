public class MemberCard {

    static final int POINTS2CASH100 = 800;
    static final int BAHT2POINTS = 25;
    long memberId;
    double totalPurchaseAmount;
    int totalPoints;
    int usagePoints;
    int remainingPoint;
    int numberOfRedeem;
    public MemberCard(long memberId){
        this.memberId = memberId;
    }
    //getter
    public long getMemberId() {
        return memberId;
    }
    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }
    public int getTotalPoints() {
        return totalPoints;
    }
    public int getUsagePoints() {
        return usagePoints;
    }
    //setter
    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }
    public void setTotalPurchaseAmount(double totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    public void setUsagePoints(int usagePoints) {
        this.usagePoints = usagePoints;
    }

    public void addPoints(double purchaseAmount){
        totalPoints = (int)purchaseAmount / BAHT2POINTS;
        remainingPoint = totalPoints ;
    }
    public void buy(double purchaseAmount){
        totalPurchaseAmount = purchaseAmount ;
        addPoints(purchaseAmount);
    }
    public int redeem(){
        if (totalPoints >= POINTS2CASH100){
            usagePoints = usagePoints + POINTS2CASH100 ;
            getRemainingPoint();
            getNumberOfRedeem();
            return 100 ;
        }else return 0;
    }
    public int getRemainingPoint(){
        return remainingPoint = remainingPoint - POINTS2CASH100;
    }
    public int getNumberOfRedeem(){
        return numberOfRedeem++;
    }
    @Override
    public String toString() {
        return "MemberCard{" +
                "memberId=" + memberId +
                ", totalPurchaseAmount=" + totalPurchaseAmount +
                ", totalPoints=" + totalPoints +
                ", usagePoints=" + usagePoints +
                ", numberOfRedeem=" + numberOfRedeem +
                ", remainingPoints=" + remainingPoint +
                '}';
    }
}



