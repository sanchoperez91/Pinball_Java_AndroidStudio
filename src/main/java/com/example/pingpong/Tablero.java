package com.example.pingpong;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;


public class Tablero extends View {
    Paint pintar = new Paint();
    int x=100, y=100;
    int xBarra=0;
    boolean dirXP=true, dirYP=true;
    boolean dirXBarra=true;

    int anchoPantalla=0;

    int puntuacion=0;

    public Tablero(Context context){
        super(context);
        setBackgroundResource(R.drawable.pinball1);

    }

    @Override
    public void onDraw(Canvas canvas){
        try{
            anchoPantalla=canvas.getWidth();
            pintar.setColor(Color.parseColor("#D7D00A"));
            canvas.drawCircle(x,y,70,pintar);

            pintar.setColor(Color.parseColor("#87C8C7"));
            canvas.drawRect(xBarra,canvas.getHeight()-50,xBarra+200, canvas.getHeight(), pintar);
            pintar.setTextSize(90);
            pintar.setColor(Color.BLACK);
            canvas.drawText("Puntuacion: "+puntuacion, 100, 100, pintar);
            if(x<70){
                dirXP=true; //Derecha
            }
            if(x>canvas.getWidth()-70){
                dirXP=false; //Izquiera
            }
            if(y<70){
                dirYP=true; //Abajo
            }

            if(y>canvas.getHeight()-70){
                dirYP=false; //Arriba
                puntuacion-=20;
            }

            if(dirXP==true){
                x+=28;
            }else{
                x-=28;
            }

            if(dirYP==true){
                y+=28;
            }else{
                y-=28;
            }


            Rect pelota =new Rect(x-70,y-70,x+70,y+70);
            Rect barra =new Rect(xBarra,canvas.getHeight()-50,xBarra+200, canvas.getHeight());
            if(pelota.intersect(barra)){
                dirYP=false;
                puntuacion+=5;
            }

            if(dirXBarra==true){
                if(xBarra<canvas.getWidth()-200) {
                    xBarra += 20;
                }
            }else{
                if(xBarra>0) {
                    xBarra -= 20;
                }
            }

            Thread.sleep(1);
            invalidate();
        }catch(Exception e){
        }
    }

    @Override

    public boolean onTouchEvent(MotionEvent e){
        float posX=e.getX();
        if(posX<anchoPantalla/2){
            dirXBarra=false;
        }else{
            dirXBarra=true;
        }
        return true;
    }
}
