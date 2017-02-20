package vn.com.fpt.boot.beans.rests;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;

import vn.com.fpt.boot.beans.components.DeploymentRegistry;
import vn.com.fpt.boot.beans.forms.HelloWorldForm;
import vn.com.fpt.boot.beans.models.HelloWorldModel;
import vn.com.fpt.boot.commons.constants.CommonConstants;
import vn.com.fpt.boot.commons.utils.HttpMessageUtils;
import vn.com.fpt.boot.commons.utils.JacksonUtils;
import vn.com.fpt.boot.commons.utils.MessageUtils;
import vn.com.fpt.boot.structures.templates.RestTemplate;

/**
 * Created by VietLK on 2/20/2017.
 */

@Component
public class HelloWorldRest extends RestTemplate<HelloWorldForm> {
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private DeploymentRegistry deploymentRegistry;

	@Override
	public String getDefinition(HelloWorldForm form, RequestEntity<HelloWorldForm> requestEntity) {
		
		String lang = HttpMessageUtils.getRequestLanguage(requestEntity.getHeaders());
		
		if(StringUtils.isEmpty(lang)) {
			lang = deploymentRegistry.get("default.language");
		}
		
		String name = form.getName();
		
		HelloWorldModel model = new HelloWorldModel();
		model.setHello(MessageUtils.getMessage(messageSource, "helloworld.hello", null, lang) + 
				CommonConstants.SINGLE_SPACE + name);
		model.setWelcome(MessageUtils.getMessage(messageSource, "helloworld.welcome.world", null, lang));
		
		return JacksonUtils.java2Json(model);
	}

	@Override
	public String putDefinition(HelloWorldForm form, RequestEntity<HelloWorldForm> requestEntity) {
		return null;
	}

	@Override
	public String postDefinition(HelloWorldForm form, RequestEntity<HelloWorldForm> requestEntity) {
		return null;
	}

	@Override
	public String deleteDefinition(HelloWorldForm form, RequestEntity<HelloWorldForm> requestEntity) {
		return null;
	}

	
}
