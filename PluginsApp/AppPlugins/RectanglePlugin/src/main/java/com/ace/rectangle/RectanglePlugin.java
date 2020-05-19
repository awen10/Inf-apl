/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.rectangle;

import com.ace.pluginsapplication.interfaces.IObserver;
import com.ace.pluginsapplication.interfaces.IPluginsAppPlugin;
import com.ace.pluginsapplication.interfaces.IShape;

/**
 *
 * @author catalin
 */
public class RectanglePlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "RectanglePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Dreptunghi";
    }

    @Override
    public IShape getShape(IObserver observer) {
        return new Rectangle(observer);
    }

}
