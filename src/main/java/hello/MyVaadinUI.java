package hello;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.vaadin.spring.annotation.VaadinUI;

import java.time.LocalTime;

@VaadinUI
public class MyVaadinUI extends UI {

    private static final long serialVersionUID = -5026493348790977491L;

    @Autowired
    private HelloController ctrl;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello! I'm the root UI!" + ctrl.home() + " " + LocalTime.now() ));
    }

}
