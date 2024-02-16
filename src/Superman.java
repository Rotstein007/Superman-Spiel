interface vergesslich {
    void vergessen();
}

public abstract class Superman implements vergesslich {
    int knowledge = 5;
    int superheroes = 0;
    double personalTime;
    String realName;

    Mission personalMission;

    public Superman()
    {
        this.knowledge = knowledge;
        this.personalTime = 10;
        this.realName = "";
        this.superheroes++;
    }

    public Superman(String realName, int knowledge, double personalTime) {
        if(knowledge <= 10 && knowledge >= 1)
            this.knowledge = knowledge;

        this.personalTime = personalTime;
        this.realName = realName;
        this.superheroes++;
    }
    public void kaempfen(int zeit) // Zeit in Minuten
    {
        if(zeit > personalTime)
            System.out.println("Die Zeit ist abgelaufen");
        else {
            double verbleibendeZeit = zeit;
            verbleibendeZeit = (double) ((personalMission.GetDifficulty() / knowledge) * (zeit * 60));

            personalMission.missionTime -= verbleibendeZeit;

            System.out.println("Gewonnen");
        }


    }

    void ueben() {
        this.knowledge++;
    }

    public String toString() {
        return "Name: " + this.realName + " Wissen: " + this.knowledge + "Anzahl Superhelden: " + this.superheroes + "Verbleibende Zeit: " + this.personalTime;
    }
}