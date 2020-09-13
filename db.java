  Connection konekcija;

    public DBBroker() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            konekcija = DriverManager.getConnection("jdbc:mysql://localhost:3306/prosoftjul19", "root", "");
            konekcija.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getKonekcija() {
        return konekcija;
    }
