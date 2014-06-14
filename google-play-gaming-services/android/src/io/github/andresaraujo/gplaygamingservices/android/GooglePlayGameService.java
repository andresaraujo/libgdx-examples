package io.github.andresaraujo.gplaygamingservices.android;

import android.app.Activity;
import android.widget.Toast;
import com.google.example.games.basegameutils.GameHelper;
import io.github.andresaraujo.gplaygamingservices.GameService;

/**
 * User: andres
 * Date: 6/14/14 - 12:15 PM
 */
public class GooglePlayGameService implements GameService, GameHelper.GameHelperListener {

    private Activity activity;
    private GameHelper gameHelper;

    public GooglePlayGameService(Activity activity){
        this.activity = activity;

        this.gameHelper =  new GameHelper(activity, GameHelper.CLIENT_GAMES);
        this.gameHelper.enableDebugLog(true);
        this.gameHelper.setup(this);
    }

    public GameHelper getGameHelper(){
        return gameHelper;
    }

    @Override
    public void Login() {
        try {
            activity.runOnUiThread(new Runnable(){

                //@Override
                public void run(){
                    gameHelper.beginUserInitiatedSignIn();
                }
            });
        }catch (final Exception ignored){}
    }

    @Override
    public void LogOut() {
        try {
            activity.runOnUiThread(new Runnable(){
                //@Override
                public void run(){
                    gameHelper.signOut();
                }
            });
        }catch (final Exception ignored){}
    }

    @Override
    public boolean isSigned() {
        return gameHelper.isSignedIn();
    }

    @Override
    public void submitScore(int score) {
        //gameHelper.getGamesClient().submitScore(getString(R.string.leaderboard_id), _score);
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

    @Override
    public void onSignInFailed() {
        Toast.makeText(activity, "Sign in failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignInSucceeded() {
        Toast.makeText(activity, "Sign in succeed", Toast.LENGTH_SHORT).show();
    }
}
