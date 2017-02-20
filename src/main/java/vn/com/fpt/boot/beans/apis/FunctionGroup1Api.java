package vn.com.fpt.boot.beans.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import vn.com.fpt.boot.beans.forms.HelloWorldForm;
import vn.com.fpt.boot.beans.rests.HelloWorldRest;
import vn.com.fpt.boot.commons.constants.UrlMappingConstants;

/**
 * Created by VietLK on 2/20/2017.
 */

@RestController
public class FunctionGroup1Api {

    @Autowired
    private HelloWorldRest helloWorldRest;
    
    
    
    
    @GetMapping(value = UrlMappingConstants.INDEX_PAGE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> getHelloWorld(@ModelAttribute HelloWorldForm form, RequestEntity requestEntity) {

        return this.helloWorldRest.get(form, requestEntity);
    }
}
