/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;
import java.util.List;
import com.ace.pluginsapplication.interfaces.IObserver;
import java.awt.Point;


public class Board implements IObserver {

    List<IShape> figures;
    Point.Float A;  //Punctul standa sus
    Point.Float B;  //Punctul dreapta jos
    public Board() {
        figures = new ArrayList<>();
        A=new Point.Float(0,0);
        B=new Point.Float(0,0);
    }

    public void AddShape(IShape shape) {
        figures.add(shape);
    }

    public void PrintBoard() {
        figures.forEach((shape) -> {
            System.out.println("Figura " + figures.indexOf(shape) + ":");
            shape.draw();
        });
        System.out.println("Lungimea Placii este:"+Math.sqrt(((B.x-A.x)*(B.x-A.x))));
        System.out.println("Latimea Placii este:"+Math.sqrt(((B.y-A.y)*(B.y-A.y))));
    }

    public boolean DeleteShape(int index) {
        if (index >= figures.size() || index < 0) {
            return false;
        }
        figures.remove(index);
        return true;
    }

    @Override
    public void Update(List<Point.Float> list) {
       A.x=Math.min(A.x, Math.min(list.get(0).x, list.get(1).x));
       A.y=Math.min(A.y, Math.min(list.get(0).y, list.get(1).y));
       B.x=Math.max(B.x, Math.max(list.get(0).x, list.get(1).x));
       B.y=Math.max(B.y, Math.max(list.get(0).y, list.get(1).y));
       System.out.println("S-a modificat");
    }
}
