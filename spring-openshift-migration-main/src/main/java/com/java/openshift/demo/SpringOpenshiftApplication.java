//package com.java.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {
	
	// String bot = "<script>\n"
	// 		+ "  window.watsonAssistantChatOptions = {\n"
	// 		+ "      integrationID: \"c1c6e890-ac87-4d47-a98d-6bd4256dd04b\", // The ID of this integration.\n"
	// 		+ "      region: \"us-south\", // The region your integration is hosted in.\n"
	// 		+ "      serviceInstanceID: \"c59f636a-c344-4b27-9dc3-8ef0117b96ae\", // The ID of your service instance.\n"
	// 		+ "      onLoad: function(instance) { instance.render(); }\n"
	// 		+ "    };\n"
	// 		+ "  setTimeout(function(){\n"
	// 		+ "    const t=document.createElement('script');\n"
	// 		+ "    t.src=\"https://web-chat.global.assistant.watson.appdomain.cloud/loadWatsonAssistantChat.js\";\n"
	// 		+ "    document.head.appendChild(t);\n"
	// 		+ "  });\n"
	// 		+ "</script>";

	String bot = "<script>\n"
			+ "	window.watsonAssistantChatOptions = {\n"
			+ " 	integrationID: \"b31cf5b7-630d-48ea-ac62-32dcd087015a\", // The ID of this integration.\n"
			+ " 	region: \"us-south\", // The region your integration is hosted in.\n"
			+ " 	serviceInstanceID: \"0f11ab2c-8e3d-4eb2-832a-7805b64e303f\", // The ID of your service instance.\n"
			+ " 	onLoad: function(instance) { instance.render(); }\n"
			+ " };\n"
			+ " setTimeout(function(){\n"
			+ " 	const t=document.createElement('script');\n"
			+ " 	t.src=\"https://web-chat.global.assistant.watson.appdomain.cloud/loadWatsonAssistantChat.js\";\n"
			+ " 	document.head.appendChild(t);\n"
			+ " });\n"
			+ " </script>";
	
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome ..." +bot;		
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Welcome ..." +input+ " appliction is successfully deployed ..." + bot;		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
			
		
		
	}

}
