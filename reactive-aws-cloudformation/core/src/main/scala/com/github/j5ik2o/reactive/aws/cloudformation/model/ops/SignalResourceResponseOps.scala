// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class SignalResourceResponseBuilderOps(val self: SignalResourceResponse.Builder) extends AnyVal {}

final class SignalResourceResponseOps(val self: SignalResourceResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSignalResourceResponseOps {

  implicit def toSignalResourceResponseBuilderOps(v: SignalResourceResponse.Builder): SignalResourceResponseBuilderOps =
    new SignalResourceResponseBuilderOps(v)

  implicit def toSignalResourceResponseOps(v: SignalResourceResponse): SignalResourceResponseOps =
    new SignalResourceResponseOps(v)

}
