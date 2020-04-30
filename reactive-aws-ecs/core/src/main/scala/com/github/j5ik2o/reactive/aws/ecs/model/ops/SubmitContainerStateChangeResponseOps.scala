// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitContainerStateChangeResponseBuilderOps(val self: SubmitContainerStateChangeResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def acknowledgmentAsScala(value: Option[String]): SubmitContainerStateChangeResponse.Builder = {
            value.fold(self){ v => self.acknowledgment(v) }
            } 


}

final class SubmitContainerStateChangeResponseOps(val self: SubmitContainerStateChangeResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def acknowledgmentAsScala: Option[String] = Option(self.acknowledgment) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitContainerStateChangeResponseOps {

implicit def toSubmitContainerStateChangeResponseBuilderOps(v: SubmitContainerStateChangeResponse.Builder): SubmitContainerStateChangeResponseBuilderOps = new SubmitContainerStateChangeResponseBuilderOps(v)

implicit def toSubmitContainerStateChangeResponseOps(v: SubmitContainerStateChangeResponse): SubmitContainerStateChangeResponseOps = new SubmitContainerStateChangeResponseOps(v)

}

