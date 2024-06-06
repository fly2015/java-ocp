api service interface:
	+ exports [package-name]
	
api service provider:
	+ requires [api-service-interface-MODULE]
	+ provides [api-service-provider-interface-NAME] with [impl-class-NAME]
	
api service locator	:
	+ requires [api-service-interface-MODULE]
	+ uses [api-service-provider-interface-NAME]
	+ exports[api-service-locator]
	
api consumer
	+ requires [api-service-interface-MODULE]
	+ requires [api-service-locator-MODULE]
	
	
Open module