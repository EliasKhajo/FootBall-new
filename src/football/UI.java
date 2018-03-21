package football;

public class UI {

    DB db = new DB();

    public void start() {
        System.out.println("                                                       ¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        System.out.println("                                                       ¤¤¤ Sport +¤¤¤");
        System.out.println("                                                       ¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        System.out.println("                     Welcome to Sprot Canal+                         ");
        System.out.println("");
        System.out.println("Allsvenskan******************2 0 1 8******************The All-Swedish");
        System.out.println("                        Swedish champions ");

    }

    public void swedenTeams() {

        System.out.println("================AIK===============|==============MALMÖ===============");

        for (int i = 0; i < 12; i++) {
            System.out.println(db.design.get(i) + db.aik.get(i) + "|" + db.design.get(i) + db.malmo.get(i));

        }
        System.out.println("=====================================================================");
        System.out.println("=============HAMMARBY=============|===========DJURGARDENS============");

        for (int i = 0; i < 12; i++) {
            System.out.println(db.design.get(i) +db.hammarby.get(i) + "|" + db.design.get(i) +db.djurgardens.get(i));

        }
        System.out.println("=====================================================================");

    }

}
