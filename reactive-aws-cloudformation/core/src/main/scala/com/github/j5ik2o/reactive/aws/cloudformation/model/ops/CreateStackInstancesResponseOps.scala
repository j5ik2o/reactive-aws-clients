// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackInstancesResponseBuilderOps(val self: CreateStackInstancesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationIdAsScala(value: Option[String]): CreateStackInstancesResponse.Builder = {
            value.fold(self){ v => self.operationId(v) }
            } 


}

final class CreateStackInstancesResponseOps(val self: CreateStackInstancesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationIdAsScala: Option[String] = Option(self.operationId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackInstancesResponseOps {

implicit def toCreateStackInstancesResponseBuilderOps(v: CreateStackInstancesResponse.Builder): CreateStackInstancesResponseBuilderOps = new CreateStackInstancesResponseBuilderOps(v)

implicit def toCreateStackInstancesResponseOps(v: CreateStackInstancesResponse): CreateStackInstancesResponseOps = new CreateStackInstancesResponseOps(v)

}

