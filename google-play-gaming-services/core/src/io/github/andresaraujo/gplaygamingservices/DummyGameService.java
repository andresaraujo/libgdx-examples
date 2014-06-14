package io.github.andresaraujo.gplaygamingservices;

public class DummyGameService implements GameService {
    @Override
    public void Login() {

    }

    @Override
    public void LogOut() {

    }

    @Override
    public boolean isSigned() {
        return false;
    }

    @Override
    public void submitScore(int score) {

    }

    @Override
    public void unlockAchievementGPGS(String achievementId) {

    }

    @Override
    public void unlockIncrementalAchievementGPGS(String achievementId, int numSteps) {

    }

    @Override
    public void getLeaderboardGPGS() {

    }

    @Override
    public void getAchievementsGPGS() {

    }

    @Override
    public void getScoresData() {

    }

    @Override
    public String getLeaderboardNames() {
        return null;
    }
}
