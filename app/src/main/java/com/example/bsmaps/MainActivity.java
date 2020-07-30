package com.example.bsmaps;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.chrisbanes.photoview.PhotoView;


public class MainActivity extends AppCompatActivity {

    private PhotoView map;

    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Инициализация карты и ее масштабирование
        map = (PhotoView)findViewById(R.id.photo_view);
        map.setImageResource(R.drawable.firstfloor);
        map.setMaximumScale(4.0f);

        //Пока это самый рабочий вариант создания bitmap. Только без изображения.
        //Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
        //       .getDefaultDisplay().getWidth(),(int)getWindowManager()
        //       .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);



        //Создание инструмента рисования через Канвас
        //Canvas painter = new Canvas(bitmap);
        //map.setImageBitmap(bitmap);

        //Ну а здесь мы художники
        //Paint paint = new Paint();
        //paint.setColor(Color.RED);


        //painter.drawLine(200f, 50f, 1000f, 50f, paint);



}

}





