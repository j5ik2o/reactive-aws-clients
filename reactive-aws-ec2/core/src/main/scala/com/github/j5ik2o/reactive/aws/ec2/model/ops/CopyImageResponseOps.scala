// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopyImageResponseBuilderOps(val self: CopyImageResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala(value: Option[String]): CopyImageResponse.Builder = {
            value.fold(self){ v => self.imageId(v) }
            } 


}

final class CopyImageResponseOps(val self: CopyImageResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala: Option[String] = Option(self.imageId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyImageResponseOps {

implicit def toCopyImageResponseBuilderOps(v: CopyImageResponse.Builder): CopyImageResponseBuilderOps = new CopyImageResponseBuilderOps(v)

implicit def toCopyImageResponseOps(v: CopyImageResponse): CopyImageResponseOps = new CopyImageResponseOps(v)

}

