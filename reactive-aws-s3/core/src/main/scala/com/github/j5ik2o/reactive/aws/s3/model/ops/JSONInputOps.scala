// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class JSONInputBuilderOps(val self: JSONInput.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[JSONType]): JSONInput.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 


}

final class JSONInputOps(val self: JSONInput) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[JSONType] = Option(self.`type`) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJSONInputOps {

implicit def toJSONInputBuilderOps(v: JSONInput.Builder): JSONInputBuilderOps = new JSONInputBuilderOps(v)

implicit def toJSONInputOps(v: JSONInput): JSONInputOps = new JSONInputOps(v)

}

