// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class BlobAttributeValueBuilderOps(val self: BlobAttributeValue.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): BlobAttributeValue.Builder = {
            value.fold(self){ v => self.value(v) }
            } 


}

final class BlobAttributeValueOps(val self: BlobAttributeValue) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.value) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBlobAttributeValueOps {

implicit def toBlobAttributeValueBuilderOps(v: BlobAttributeValue.Builder): BlobAttributeValueBuilderOps = new BlobAttributeValueBuilderOps(v)

implicit def toBlobAttributeValueOps(v: BlobAttributeValue): BlobAttributeValueOps = new BlobAttributeValueOps(v)

}

