package yb.yadnyesh.udemy.basicsstrong.annoimpl;

public class Application {
    public static void main(String[] args) throws Exception{
        TransactionHistory sangeeta = new TransactionHistory(15000, "Sangeeta", "Credit", 10000);
        TransactionHistory malvika = new TransactionHistory(13000, "Malvika", "Credit", 11000);
        TransactionHistory niivii = new TransactionHistory(17000, "Niivii", "Credit", 13000);
        TransactionHistory megha = new TransactionHistory(19000, "Megha", "Credit", 10000);

        Hibernate<TransactionHistory> hibernate = Hibernate.getConnection();

        hibernate.write(sangeeta);
        hibernate.write(malvika);
        hibernate.write(niivii);
        hibernate.write(megha);
        TransactionHistory transactionHistory = hibernate.read(TransactionHistory.class, 1L);
        System.out.println("Read transaction: " + transactionHistory);

    }
}
