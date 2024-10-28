/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layouts;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelos.menu_items.MenuType;

/**
 *
 * @author fabri
 */
public class menu_layout {
    String icon;
    String name;
    MenuType type;
    
    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
    
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public menu_layout(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }
        
    public menu_layout() {
    }
    
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/assets/" + icon + ".png"));
    }
    
    public Icon toIconSelected() {
        return new ImageIcon(getClass().getResource("/assets/" + icon + "_selected.png"));
    }
    
    public static enum MenuType{
        MENU, EMPTY
    }
}
