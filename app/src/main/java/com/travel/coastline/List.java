package com.travel.coastline;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Button button=(Button)findViewById(R.id.Tanwen);
        Button button1=(Button)findViewById(R.id.Dashan);
        Button button2=(Button)findViewById(R.id.Houlong);
        Button button3=(Button)findViewById(R.id.Longgang);
        Button button4=(Button)findViewById(R.id.Baishatun);
        Button button5=(Button)findViewById(R.id.Xinpu);
        Button button6=(Button)findViewById(R.id.Tongxiao);
        Button button7=(Button)findViewById(R.id.Yuanli);
        Button button8=(Button)findViewById(R.id.Rinan);
        Button button9=(Button)findViewById(R.id.Dajia);
        Button button10=(Button)findViewById(R.id.TaichungPort);
        Button button11=(Button)findViewById(R.id.Qingshui);
        Button button12=(Button)findViewById(R.id.Shalu);
        Button button13=(Button)findViewById(R.id.Longjing);
        Button button14=(Button)findViewById(R.id.Dadu);
        Button button15=(Button)findViewById(R.id.Zhuifen);

        button.setOnClickListener(Tanwen);
        button1.setOnClickListener(Dashan);
        button2.setOnClickListener(Houlong);
        button3.setOnClickListener(Longgang);
        button4.setOnClickListener(Baishatun);
        button5.setOnClickListener(Xinpu);
        button6.setOnClickListener(Tongxiao);
        button7.setOnClickListener(Yuanli);
        button8.setOnClickListener(Rinan);
        button9.setOnClickListener(Dajia);
        button10.setOnClickListener(TaichungPort);
        button11.setOnClickListener(Qingshui);
        button12.setOnClickListener(Shalu);
        button13.setOnClickListener(Longjing);
        button14.setOnClickListener(Dadu);
        button15.setOnClickListener(Zhuifen);
    }

    //Tanwen
    private RadioGroup.OnClickListener Tanwen=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("談文車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Toast.makeText(List.this,"談文車站附近沒有美食",Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,TanwenSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Dashan
    private RadioGroup.OnClickListener Dashan=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("大山車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Toast.makeText(List.this,"大山車站附近沒有美食",Toast.LENGTH_SHORT).show();

                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,DashanSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Houlong
    private RadioGroup.OnClickListener Houlong=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("後龍車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,HoulongFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,HoulongSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Longgang
    private RadioGroup.OnClickListener Longgang=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("龍港車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Toast.makeText(List.this,"龍港車站附近沒有美食",Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,LonggangSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Baishatun
    private RadioGroup.OnClickListener Baishatun=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("白沙屯車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,BaishatunFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,BaishatunSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Xinpu
    private RadioGroup.OnClickListener Xinpu=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("新埔車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Toast.makeText(List.this,"新埔車站附近沒有美食",Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,XinpuSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };
    //Tongxiao
    private RadioGroup.OnClickListener Tongxiao=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("通霄車站");
            builder.setNegativeButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,TongxiaoFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setPositiveButton("美食部落格1", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,TongxiaoFood1.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNeutralButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,TongxiaoSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Yuanli
    private RadioGroup.OnClickListener Yuanli=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("苑裡車站");
            builder.setNegativeButton("美食部落格1", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,YuanliFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setPositiveButton("美食部落格2", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,YuanliFood1.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNeutralButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,YuanliSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Rinan
    private RadioGroup.OnClickListener Rinan=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("日南車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Toast.makeText(List.this,"日南車站附近沒有美食",Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,RinanSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Dajia
    private RadioGroup.OnClickListener Dajia=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("大甲車站");
            builder.setPositiveButton("美食部落格", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,DajiaFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,DajiaSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //TaichungPort
    private RadioGroup.OnClickListener TaichungPort=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("臺中港車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Toast.makeText(List.this,"臺中港車站附近沒有美食",Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,TaichungPortSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Qingshui
    private RadioGroup.OnClickListener Qingshui=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("清水車站");
            builder.setPositiveButton("美食部落格", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,QingshuiFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,QingshuiSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Shalu
    private RadioGroup.OnClickListener Shalu=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("沙鹿車站");
            builder.setPositiveButton("美食部落格", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,ShaluFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,ShaluSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Longjing
    private RadioGroup.OnClickListener Longjing=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("龍井車站");
            builder.setPositiveButton("美食部落格", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,LongjingFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,LongjingSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Dadu
    private RadioGroup.OnClickListener Dadu=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("大肚車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,DaduFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,DaduSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };

    //Zhuifen
    private RadioGroup.OnClickListener Zhuifen=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(List.this);	//main是class name
            builder.setTitle("追分車站");
            builder.setPositiveButton("美食", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,ZhuifenFood.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("景點", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int which){
                    Intent intent=new Intent(); //郵局
                    intent.setClass(List.this,ZhuifenSpot.class); //寄件人，收件人
                    Bundle bundle=new Bundle(); //郵差
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            builder.show();
        }
    };
}
