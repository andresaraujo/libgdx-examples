package io.github.andresaraujo.gplaygamingservices;


public interface GameService {

    public void Login();
    public void LogOut();
    public boolean isSigned();

    public void submitScore(int score);
    public void unlockAchievementGPGS(String achievementId);
    public void unlockIncrementalAchievementGPGS(String achievementId, int numSteps);
    public void getLeaderboardGPGS();
    public void getAchievementsGPGS();

    public void getScoresData();
    public String getLeaderboardNames();
}