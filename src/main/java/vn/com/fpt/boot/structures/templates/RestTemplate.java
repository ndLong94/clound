package vn.com.fpt.boot.structures.templates;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import vn.com.fpt.boot.commons.constants.CommonConstants;
import vn.com.fpt.boot.commons.constants.ServerStatusConstants;
import vn.com.fpt.boot.commons.objects.RestForm;
import vn.com.fpt.boot.commons.objects.ServerStatus;
import vn.com.fpt.boot.commons.utils.JacksonUtils;
import vn.com.fpt.boot.commons.utils.MessageUtils;

/**
 * Created by VietLK on 2/20/2017.
 */
public abstract class RestTemplate<F extends RestForm> {

    private MessageSource messageSource;
    

    // TEMPLATE METHODS =============================================================================

    public final ResponseEntity<String> get(F form, RequestEntity<F> requestEntity) {

        HttpHeaders responseHeaders = new HttpHeaders();
        String sBody = CommonConstants.EMPTY_STRING;
        ServerStatus serverStatus = null;
        
        

        sBody = getDefinition(form, requestEntity);

        // check sBody for abnomally status
        if(StringUtils.isEmpty(sBody)) {

            // return ServerStatus
            serverStatus = new ServerStatus(ServerStatusConstants.ERROR_404,
                    MessageUtils.getMessage(messageSource, "err.404", null, ""));
            
            sBody = JacksonUtils.java2Json(serverStatus);
        }

        return new ResponseEntity<String>(sBody, responseHeaders, HttpStatus.OK);
    }

    public final ResponseEntity<String> put(F form, RequestEntity<F> requestEntity) {

        return null;
    }

    public final ResponseEntity<String> post(F form, RequestEntity<F> requestEntity) {

        return null;
    }

    public final ResponseEntity<String> delete(F form, RequestEntity<F> requestEntity) {

        return null;
    }

    // HELPER METHODS =============================================================================








    // ABSTRACT METHODS =============================================================================

    /**
     * Abstract Method for what put method will do
     * @param requestEntity
     * @return
     */
    public abstract String getDefinition(F form, RequestEntity<F> requestEntity);

    /**
     * Abstract method for what put method will do
     * @param requestEntity
     * @return
     */
    public abstract String putDefinition(F form, RequestEntity<F> requestEntity);

    /**
     * Abstract method for what post method will do
     * @param requestEntity
     * @return
     */
    public abstract String postDefinition(F form, RequestEntity<F> requestEntity);

    /**
     * Abstract method for what delete method will do
     * @param requestEntity
     * @return
     */
    public abstract String deleteDefinition(F form, RequestEntity<F> requestEntity);
}
