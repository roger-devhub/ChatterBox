// add an import for Intent
+import android.content.Intent;
// Setup two strings for the intent
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_CHANNEL_TYPE = "com.example.chattutorial.CHANNEL_TYPE";
    public static final String EXTRA_CHANNEL_ID = "com.example.chattutorial.CHANNEL_ID";

    /*
    * Add handsfree recording with audio|video as the default method for chatting to individuals or groups.
    * Add Free account with ads, but without video chat.
    * Add Basic account without ads, but without video chat.
    * Add Pro account without ads, but with video chat included.
    * Price Basic account at $1 p.m or $10 p.a once-off (saving $2 p.a).
    * Price Pro account at $3 p.m or $30 p.a once-off (saving $6 p.a).
     */

    // replace the channel click handler
     binding.channelList.setOnChannelClickListener(channel -> {
        // open the channel activity
        Intent intent = new Intent(MainActivity.this, ChannelActivity.class);
        intent.putExtra(EXTRA_CHANNEL_TYPE, channel.getType());
        intent.putExtra(EXTRA_CHANNEL_ID, channel.getId());
        startActivity(intent);
    });

}