// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttributeBooleanValueBuilderOps(val self: AttributeBooleanValue.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[Boolean]): AttributeBooleanValue.Builder = {
            value.fold(self){ v => self.value(v) }
            } 


}

final class AttributeBooleanValueOps(val self: AttributeBooleanValue) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[Boolean] = Option(self.value) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeBooleanValueOps {

implicit def toAttributeBooleanValueBuilderOps(v: AttributeBooleanValue.Builder): AttributeBooleanValueBuilderOps = new AttributeBooleanValueBuilderOps(v)

implicit def toAttributeBooleanValueOps(v: AttributeBooleanValue): AttributeBooleanValueOps = new AttributeBooleanValueOps(v)

}

