package vn.com.fpt.boot.beans.forms;

import vn.com.fpt.boot.commons.objects.RestForm;

/**
 * Created by VietLK on 2/20/2017.
 */
public class HelloWorldForm extends RestForm {

    private String name;

    public HelloWorldForm() {

        super();
    }

    public HelloWorldForm(String name) {

        super();
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
