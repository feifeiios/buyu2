package fishjoy.control.help;


import fishjoy.control.menu.MainMenu;
import fishjoy.control.menu.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageButton;

public class Help extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);

		//ªÒµ√Gallery∂‘œÛ
		Gallery g = (Gallery) findViewById(R.id.Gallery01);

		//ÃÌº”ImageAdapter∏¯Gallery∂‘œÛ
		g.setAdapter(new ImageAdapter(this));

		//…Ë÷√Galleryµƒ±≥æ∞
		g.setBackgroundResource(0);

		//…Ë÷√GalleryµƒÕº∆¨º‰∏Ù
		g.setSpacing(120);

		/* findViewById(R.id.button1)»°µ√≤ºæ÷main.xml÷–µƒhelp */
		ImageButton returnbutton = (ImageButton) findViewById(R.id.help_back);
		/* º‡Ã˝buttonµƒ ¬º˛–≈œ¢ */
		returnbutton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				// –¬Ω®“ª∏ˆIntent∂‘œÛ
				Intent intent = new Intent();
				// ÷∏∂®intent“™∆Ù∂Øµƒ¿‡
				intent.setClass(Help.this, MainMenu.class);
				// ∆Ù∂Ø“ª∏ˆ–¬µƒActivity
				startActivity(intent);
				// πÿ±’µ±«∞µƒActivity
				Help.this.finish();
			}
		});
	}


}
