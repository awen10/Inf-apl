/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class ApplicationMenu {

    private PluginManager pluginMan;
    private Menu mainMenu = null;
    private Board board = null;

    public ApplicationMenu(PluginManager pluginMan) {
        this.pluginMan = pluginMan;
        this.board = new Board();
    }

    public void load() {
        pluginMan.loadPlugins("/plugins");
        ArrayList<IMenuItem> mainMenuItems = new ArrayList();
        ArrayList<IMenuItem> addMenuItems = new ArrayList();
        ArrayList<IMenuItem> modifyMenuItems = new ArrayList();

        int shortCut = 1;
        var plugins = pluginMan.getPlugins();

        
        for (int i = 0; i < plugins.size(); i++) {
            var currentPlugin = plugins.get(i);
            MenuItem currentItem = new MenuItem(plugins.get(i).getDisplayText(), shortCut++, (parameters) -> {
                IShape shape = currentPlugin.getShape();
                shape.read();
                board.AddShape(shape);
            });
            addMenuItems.add(currentItem);

        }
        mainMenuItems.add(new Menu("Adaugare", 1, addMenuItems));

        
        mainMenuItems.add(new MenuItem("Stergere",
                2,
                (parameters) -> {
                   
                    }
        ));

        
        shortCut = 1;
        for (int i = 0; i < plugins.size(); i++) {
            var currentPlugin = plugins.get(i);
            MenuItem currentItem = new MenuItem("Transforma in " + plugins.get(i).getDisplayText(),
                    shortCut++,
                    (parameters) -> {
                        
                    });
            modifyMenuItems.add(currentItem);
        }
        mainMenuItems.add(new Menu("Modificare", 3, modifyMenuItems));

        
        mainMenuItems.add(new MenuItem("Vizualizare plansa",
                4,
                (parameters) -> {
                    board.PrintBoard();
                }));

        mainMenu = new Menu("Meniu", -1, mainMenuItems);
    }

    public void execute() {
        mainMenu.execute();
    }

}
