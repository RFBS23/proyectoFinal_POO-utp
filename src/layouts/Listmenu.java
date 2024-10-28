/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layouts;

import components.EventMenuCallBack;
import components.eventMenuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author fabri
 */
public class Listmenu<E extends Object> extends JList<E> {
    public void addEventSelectedMenu(eventMenuSelected event) {
        events.add(event);
    }
    
    private final DefaultListModel model;
    private final List<eventMenuSelected> events;
    private int selectedIndex = -1;
    
    public Listmenu() {
        model = new DefaultListModel();
        events = new ArrayList<>();
        super.setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me){
                if (SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    Object obj = model.getElementAt(index);
                    if (obj instanceof menu_layout) {
                        menu_layout data = (menu_layout) obj;
                        if(data.getType() == menu_layout.MenuType.MENU) {
                            if(index != selectedIndex) {
                                selectedIndex = -1;
                                runEvent(index);
                            }
                        }
                    }                    
                    else {
                        if(index != selectedIndex) {
                            selectedIndex = -1;
                            runEvent(index);
                        }
                    }
                }
            }
        });
    }

    private void runEvent(int indexChange){
        for(eventMenuSelected event : events) {
            event.menuSelected(indexChange, new EventMenuCallBack() {
                @Override
                public void call(int index) {
                    selectedIndex = index;
                    repaint();
                }
            });
        }
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                menu_layout data;
                if(o instanceof menu_layout) {
                    data = (menu_layout) o;
                } else {
                    data = new menu_layout("1", o + "", menu_layout.MenuType.MENU);
                }
                menuitem item = new menuitem(data);
                item.setSelected(index == selectedIndex);
                return item;
            }            
        };
    }

    @Override
    public void setModel(ListModel<E> lm) {
        for(int i=0; i < lm.getSize(); i++){
            model.addElement(lm.getElementAt(i));
        }
    }
    
    public void addItem (menu_layout data) {
        model.addElement(data);
    }
    
    
}
