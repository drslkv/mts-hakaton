package ru.aston.buySystem;

import ru.aston.components.ComponentBase;

import java.util.ArrayList;
import java.util.List;


public class BuySystem {

  public static List<ComponentBase> getComponents(Order order)
    {
        List<ComponentBase> componentBaseList = new ArrayList<>();
        for(int i = 0; i < order.getCount();i++)
        {
            componentBaseList.add(order.getComponent());
        }

        return componentBaseList;
    }
}
