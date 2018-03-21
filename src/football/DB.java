package football;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class DB {

    public DB() {
        creatDB();
    }
    ArrayList<ArrayList<String>> sweden = new ArrayList<>();

    ArrayList<String> aik = new ArrayList<>();
    ArrayList<String> malmo = new ArrayList<>();
    ArrayList<String> hammarby = new ArrayList<>();
    ArrayList<String> djurgardens = new ArrayList<>();
    ArrayList<String> team = new ArrayList<>();
    ArrayList<String> design = new ArrayList<>();
    ArrayList<Integer> win = new ArrayList<>();
   
    public void creatDB() {
        
        
        
        
        win.add(1);
        win.add(2);
        win.add(3);
        win.add(4);

        aik.add("Oscar Linnér        ");
        aik.add("Alexander Milosevic ");
        aik.add("Rasmus Lindkvist    ");
        aik.add("Jesper Nyholm       ");
        aik.add("Joel Ekstrand       ");
        aik.add("Kristoffer Olsson   ");
        aik.add("Nabil Bahoui        ");
        aik.add("Ahmed Yasin         ");
        aik.add("Enoch Kofi Adu      ");
        aik.add("Nicolás Stefanelli  ");
        aik.add("Henok Goitom        ");
        aik.add("Stefan Silv         ");

        sweden.add(aik);

        malmo.add("Johan Dahlin        ");
        malmo.add("Behrang Safari      ");
        malmo.add("Franz Brorsson      ");
        malmo.add("Lasse Nielsen       ");
        malmo.add("Rasmus Bengtsson    ");
        malmo.add("Oscar Lewicki       ");
        malmo.add("Fouad Bachirou      ");
        malmo.add("Arnór Traustason    ");
        malmo.add("Mattias Svanberg    ");
        malmo.add("Markus Rosenberg    ");
        malmo.add("Carlos Strandberg   ");
        malmo.add("Alexander Jeremejeff");

        sweden.add(malmo);

        hammarby.add("Johan Wiland        ");
        hammarby.add("Björn Paulsen       ");
        hammarby.add("Mads Fenger         ");
        hammarby.add("Marcus Degerlund    ");
        hammarby.add("Simon Sandberg      ");
        hammarby.add("Jiloan Hamad        ");
        hammarby.add("Arnór Smárason      ");
        hammarby.add("Erkan Zengin        ");
        hammarby.add("Jeppe Andersen      ");
        hammarby.add("Sander Svendsen     ");
        hammarby.add("Muamer Tankovic     ");
        hammarby.add("Nikola Djurdjic     ");

        sweden.add(hammarby);

        djurgardens.add("Andreas Isaksson    ");
        djurgardens.add("Felix Beijmo        ");
        djurgardens.add("Jonas Olsson        ");
        djurgardens.add("Jacob Une Larsson   ");
        djurgardens.add("Marcus Danielsson   ");
        djurgardens.add("Kerim Mrabti        ");
        djurgardens.add("Dzenis Kozica       ");
        djurgardens.add("Kevin Walker        ");
        djurgardens.add("Jonathan Ring       ");
        djurgardens.add("Aliou Badji         ");
        djurgardens.add("Tino Kadewere       ");
        djurgardens.add("Edward Chilufya     ");

        sweden.add(djurgardens);

        team.add("AIK");
        team.add("MALMÖ");
        team.add("HAMMARBY");
        team.add("DJURGARDENS");

        design.add("Målvakt     : ");
        design.add("Försvarare  : ");
        design.add("              ");
        design.add("              ");
        design.add("              ");
        design.add("Mittfältare : ");
        design.add("              ");
        design.add("              ");
        design.add("              ");
        design.add("Anfallare   : ");
        design.add("              ");
        design.add("              ");

        
        
        
//        TreeMap<String, Integer> winner = new TreeMap<>();
//        int x=0;
//        for (int i = 0; i < team.size(); i++) {
//            
//            winner.put(i);
//            
//        }
//        if (winner.containsKey(db.team.get(i))) {
//                        r = winner.get(db.team.get(i));
//                    } else {
//                        r = 0;
//                    }
//                    winner.put(db.team.get(i), r + 1);
    }

}
