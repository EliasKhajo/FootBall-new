package football;

import java.util.*;

public class Methods extends Thread {

    TreeMap<String, Integer> winner = new TreeMap<>();

    DB db = new DB();
    Random random = new Random();

    public void game() throws InterruptedException {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue;
                }
                int minute = 0;
                int max = 0;
                int teamGoal1 = 0;
                int teamGoal2 = 0;
                int goal = 1;
                int scored = 0;
                int aik = 0;
                int malmo = 0;
                int djurgardens = 0;
                int hammarby = 0;
                int r = 0;

//                Thread.sleep(1000);
                do {
                    minute = random.nextInt(90) + 1 + max;

                    if (minute < 91) {
                        int round = random.nextInt(2) + 1;
//                        Thread.sleep(1200);
                        switch (round) {
                            case 1:

                                scored = random.nextInt(db.sweden.get(i).size());
                                System.out.println(db.team.get(i) + " scored the " + goal
                                        + " goal in the " + minute + " minute!");
                                System.out.println("Scored by " + db.sweden.get(i).get(scored));
                                teamGoal1++;
                                break;

                            case 2:
                                scored = random.nextInt(db.sweden.get(j).size());
                                System.out.println(db.team.get(j) + " scored the " + goal
                                        + " goal in the " + minute + " minute!");
                                System.out.println("Scored by " + db.sweden.get(j).get(scored));
                                teamGoal2++;
                                break;
                        }

                    }
                    goal++;
                    max = minute;
                } while (minute > 0 && minute < 91);
//                Thread.sleep(1000);
                System.out.println("***** Full Time *****");

                if (teamGoal1 > teamGoal2) {
                    if (winner.containsKey(db.team.get(i))) {
                        r = winner.get(db.team.get(i));
                    } else {
                        r = 0;
                    }
                    winner.put(db.team.get(i), r + 1);

                    System.out.println(db.team.get(i) + "(" + teamGoal1 + ")" + " won against " + "(" + teamGoal2 + ")" + db.team.get(j));

                } else if (teamGoal1 < teamGoal2) {
                    if (winner.containsKey(db.team.get(j))) {
                        r = winner.get(db.team.get(j));
                    } else {
                        r = 0;
                    }
                    System.out.println(db.team.get(i) + "(" + teamGoal1 + ")" + " lost to " + "(" + teamGoal2 + ")" + db.team.get(j));
                    winner.put(db.team.get(j), r + 1);
                } else {
                    System.out.println(db.team.get(i) + "(" + teamGoal1 + ")" + " Draw " + "(" + teamGoal2 + ")" + db.team.get(j));
                }
                System.out.println("=====================================================================");

            }
        }
        gameResult();
        gameResult2();

    }

    public void gameResult() {
        List<Integer> listGoals = new ArrayList<>(winner.values());
        List<String> listString = new ArrayList<>(winner.keySet());

        ArrayList<Integer> MaxIndexes = new ArrayList<>();

        MaxIndexes.add(0);

        for (int i = 1; i < listGoals.size(); i++) {

            if (listGoals.get(i) > listGoals.get(MaxIndexes.get(0))) {
                MaxIndexes.clear();
                MaxIndexes.add(i);

            } else if (listGoals.get(i) == listGoals.get(MaxIndexes.get(0))) {
                MaxIndexes.add(i);
            }
        }
        if (MaxIndexes.size() > 1) {

            System.out.println("We have " + MaxIndexes.size() + " winners that won with equal amount of goals\n The winning teams are: ");

            System.out.println("winning indexes");

            for (Integer MaxIndexe : MaxIndexes) {
                System.out.println(MaxIndexe);
            }

            for (Integer MaxIndexe : MaxIndexes) {
                System.out.println(listString.get(MaxIndexe));
            }
        } else {
            System.out.println("We have one champion team");
            System.out.println(listString.get(MaxIndexes.get(0)));
        }

        Set set = winner.entrySet();
        Iterator i = set.iterator();
        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print("Teams : " + me.getKey() + " | Points : ");
            System.out.println(me.getValue());
        }

    }
    
    public void gameResult2(){
        List<String> list=new ArrayList<>();
        int max=winner.values().stream().max(Integer::compare).get();
        System.out.println("-----------------------------------------------");
        for (Map.Entry<String, Integer> entry : winner.entrySet()) {
            System.out.println("Teams : "+entry.getKey()+" | Points : "+entry.getValue());
            if(entry.getValue()==max){
                list.add(entry.getKey());
            }
        }
        if(list.size()>1)
            System.out.println("We have " + list.size() + " winners that won with equal amount of goals\n The winning teams are: ");
        else System.out.println("We have one champion : ");
        
        for (String string : list) {
            System.out.println(string);
            
        }
    }
    
    
}


