// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DeregisterStreamConsumerRequestBuilderOps(val self: DeregisterStreamConsumerRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamARNAsScala(value: Option[String]): DeregisterStreamConsumerRequest.Builder = {
            value.fold(self){ v => self.streamARN(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def consumerNameAsScala(value: Option[String]): DeregisterStreamConsumerRequest.Builder = {
            value.fold(self){ v => self.consumerName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def consumerARNAsScala(value: Option[String]): DeregisterStreamConsumerRequest.Builder = {
            value.fold(self){ v => self.consumerARN(v) }
            } 


}

final class DeregisterStreamConsumerRequestOps(val self: DeregisterStreamConsumerRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamARNAsScala: Option[String] = Option(self.streamARN) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def consumerNameAsScala: Option[String] = Option(self.consumerName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def consumerARNAsScala: Option[String] = Option(self.consumerARN) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterStreamConsumerRequestOps {

implicit def toDeregisterStreamConsumerRequestBuilderOps(v: DeregisterStreamConsumerRequest.Builder): DeregisterStreamConsumerRequestBuilderOps = new DeregisterStreamConsumerRequestBuilderOps(v)

implicit def toDeregisterStreamConsumerRequestOps(v: DeregisterStreamConsumerRequest): DeregisterStreamConsumerRequestOps = new DeregisterStreamConsumerRequestOps(v)

}

