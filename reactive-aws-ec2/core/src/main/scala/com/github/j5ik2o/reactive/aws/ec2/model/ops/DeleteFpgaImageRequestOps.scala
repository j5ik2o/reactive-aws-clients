// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFpgaImageRequestBuilderOps(val self: DeleteFpgaImageRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fpgaImageIdAsScala(value: Option[String]): DeleteFpgaImageRequest.Builder = {
            value.fold(self){ v => self.fpgaImageId(v) }
            } 


}

final class DeleteFpgaImageRequestOps(val self: DeleteFpgaImageRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFpgaImageRequestOps {

implicit def toDeleteFpgaImageRequestBuilderOps(v: DeleteFpgaImageRequest.Builder): DeleteFpgaImageRequestBuilderOps = new DeleteFpgaImageRequestBuilderOps(v)

implicit def toDeleteFpgaImageRequestOps(v: DeleteFpgaImageRequest): DeleteFpgaImageRequestOps = new DeleteFpgaImageRequestOps(v)

}

