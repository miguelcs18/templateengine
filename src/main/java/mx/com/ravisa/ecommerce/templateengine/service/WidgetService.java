package mx.com.ravisa.ecommerce.templateengine.service;

import mx.com.ravisa.ecommerce.templateengine.model.Widget;

import java.util.List;

public interface WidgetService {
    Widget addWidget(Widget widget);
    List<Widget> getAllWidgets();
    List<Widget> getAllWidgetsActive();
}
