// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFpgaImageResponseBuilderOps(val self: DeleteFpgaImageResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def returnValueAsScala(value: Option[Boolean]): DeleteFpgaImageResponse.Builder = {
            value.fold(self){ v => self.returnValue(v) }
            } 


}

final class DeleteFpgaImageResponseOps(val self: DeleteFpgaImageResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def returnValueAsScala: Option[Boolean] = Option(self.returnValue) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFpgaImageResponseOps {

implicit def toDeleteFpgaImageResponseBuilderOps(v: DeleteFpgaImageResponse.Builder): DeleteFpgaImageResponseBuilderOps = new DeleteFpgaImageResponseBuilderOps(v)

implicit def toDeleteFpgaImageResponseOps(v: DeleteFpgaImageResponse): DeleteFpgaImageResponseOps = new DeleteFpgaImageResponseOps(v)

}

