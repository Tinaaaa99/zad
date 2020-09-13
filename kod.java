    initComponents();
        try {
            Image img = ImageIO.read(new File("zastava.png"));
            Image dimg = img.getScaledInstance(85, 128, Image.SCALE_SMOOTH);
            slika.setIcon(new ImageIcon(dimg));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/resources/mcfg.properties"));
            
            int brzinaOsvjezavanja = Integer.parseInt(props.getProperty("brzinaOsvjezavanja"));
            System.out.println("Brzina osvjezavanja je " + brzinaOsvjezavanja);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Zastava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Zastava.class.getName()).log(Level.SEVERE, null, ex);
        }
