// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IKEVersionsListValueBuilderOps(val self: IKEVersionsListValue.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[String]): IKEVersionsListValue.Builder = {
            value.fold(self){ v => self.value(v) }
            } 


}

final class IKEVersionsListValueOps(val self: IKEVersionsListValue) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[String] = Option(self.value) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIKEVersionsListValueOps {

implicit def toIKEVersionsListValueBuilderOps(v: IKEVersionsListValue.Builder): IKEVersionsListValueBuilderOps = new IKEVersionsListValueBuilderOps(v)

implicit def toIKEVersionsListValueOps(v: IKEVersionsListValue): IKEVersionsListValueOps = new IKEVersionsListValueOps(v)

}

