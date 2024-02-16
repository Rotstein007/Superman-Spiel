public class Mission {
    int difficulty;
    public double missionTime;

    public Mission(double missionTime, int difficulty) {
        this.difficulty = difficulty;
        this.missionTime = missionTime;
    }

    double adjustMissionTime (int zeit) {
        return missionTime -= zeit;
    }

    public int GetDifficulty() {
        return difficulty;
    }

}