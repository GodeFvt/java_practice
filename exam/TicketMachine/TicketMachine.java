public class TicketMachine {
    double ticketPrice;
    int numberOfTickets;
    int numberOfCoins;
    int customerCoins;
    //3 constructors
    TicketMachine(int numberOfTickets){
        this.numberOfTickets=numberOfTickets;
    }
    TicketMachine(double ticketPrice ){
        this.ticketPrice=ticketPrice;
    }
    TicketMachine(double ticketPrice, int numberOfTickets){
        this.ticketPrice=ticketPrice;
        this.numberOfTickets=numberOfTickets;
    }
    //

    //getter/setter TicketPrice
    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    //

    //getter numberOfTickets,numberOfCoins,customerCoins
    public int getNumberOfTickets() {
        return numberOfTickets;
    }
    public int getNumberOfCoins() {
        return numberOfCoins;
    }
    public int getCustomerCoins() {
        return customerCoins;
    }
    //

    //toString()
    @Override
    public String toString() {
        return "TicketMachine{" +
                "ticket price= " + String.format("%.2f", ticketPrice) +
                "," + numberOfTickets + " tickets"+
                "," + numberOfCoins + " coins"+
                ",customer " + customerCoins + " coins"+
                '}';
    }
    //
    public void receiveTicketsFromAdmin(int receiveTicket){
        numberOfTickets = numberOfTickets+ receiveTicket;
    }
    public int giveAllCoinsToAdmin(){
        int coins = numberOfCoins ;
        numberOfCoins = 0 ;
        return coins ;
    }
    public void  receiveCoinsFromCustomer(int receiveCoins){
        customerCoins = customerCoins + receiveCoins;
    }
    public int sellTicketsToCustomer(int sellTickets){
        int toTolPrice= (int)(Math.ceil(sellTickets * ticketPrice)) ;
        if (sellTickets > numberOfTickets) return -1;

        if(customerCoins < toTolPrice ) return -2;

        else numberOfTickets = numberOfTickets - sellTickets;
        numberOfCoins = toTolPrice;
        int change = customerCoins - toTolPrice;
        customerCoins = 0 ;
        return change;
    }

    public int returnCoinsToCustomer(){
        int change = customerCoins;
        customerCoins = 0 ;
        return change;
    }

    public static void main(String[] args) {

        TicketMachine tm = new TicketMachine(5.5, 2);
        tm.receiveTicketsFromAdmin(3);
        tm.receiveTicketsFromAdmin(4);
        System.out.println(tm);
        tm.receiveCoinsFromCustomer(25);
        tm.receiveCoinsFromCustomer(12);
        System.out.println(tm);
        System.out.println(tm.sellTicketsToCustomer(5));
        System.out.println(tm);
        System.out.println(tm.giveAllCoinsToAdmin());
        System.out.println(tm);

    }
}
