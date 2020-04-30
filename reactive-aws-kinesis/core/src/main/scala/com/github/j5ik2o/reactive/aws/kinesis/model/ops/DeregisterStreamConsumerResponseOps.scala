// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DeregisterStreamConsumerResponseBuilderOps(val self: DeregisterStreamConsumerResponse.Builder) extends AnyVal {


}

final class DeregisterStreamConsumerResponseOps(val self: DeregisterStreamConsumerResponse) extends AnyVal {


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterStreamConsumerResponseOps {

implicit def toDeregisterStreamConsumerResponseBuilderOps(v: DeregisterStreamConsumerResponse.Builder): DeregisterStreamConsumerResponseBuilderOps = new DeregisterStreamConsumerResponseBuilderOps(v)

implicit def toDeregisterStreamConsumerResponseOps(v: DeregisterStreamConsumerResponse): DeregisterStreamConsumerResponseOps = new DeregisterStreamConsumerResponseOps(v)

}

