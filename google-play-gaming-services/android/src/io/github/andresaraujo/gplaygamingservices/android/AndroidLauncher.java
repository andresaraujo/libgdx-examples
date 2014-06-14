package io.github.andresaraujo.gplaygamingservices.android;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Toast;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.example.games.basegameutils.GameHelper;
import io.github.andresaraujo.gplaygamingservices.GameService;
import io.github.andresaraujo.gplaygamingservices.MyGdxGame;

public class AndroidLauncher extends AndroidApplication {

    //private GameHelper gameHelper;
    private GooglePlayGameService gpgs;

    public AndroidLauncher(){}

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        gpgs =  new GooglePlayGameService(this);
		initialize(new MyGdxGame(gpgs), config);

        /*this.gameHelper =  new GameHelper(this, GameHelper.CLIENT_GAMES);
        this.gameHelper.enableDebugLog(true);
        this.gameHelper.setup(this);*/
	}

    @Override
    public void onStart(){
        super.onStart();
        gpgs.getGameHelper().onStart(this);
        //this.gameHelper.onStart(this);
    }

    @Override
    public void onStop(){
        super.onStop();
        gpgs.getGameHelper().onStop();
        //this.gameHelper.onStop();
    }

    @Override
    public void onActivityResult(int request, int response, Intent data) {
        super.onActivityResult(request, response, data);
        gpgs.getGameHelper().onActivityResult(request, response, data);
        //this.gameHelper.onActivityResult(request, response, data);

    }
}