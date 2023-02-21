package KafkaDemoRoute;

import org.apache.camel.builder.RouteBuilder;;

public class KafkaDemoRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("direct:addPet")
            .id("add-pets-route")
            .log("** INCOMING PAYLOAD **")
            .log("\n ${body}")
            .log("** END PAYLOAD **")
            .to("kafka:my-topic?brokers=my-cluster-kafka-bootstrap-kafka-demo.apps.red-hat-adventures.rtaneja.net:443");
    }
    
}