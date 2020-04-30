// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CommonPrefixBuilderOps(val self: CommonPrefix.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala(value: Option[String]): CommonPrefix.Builder = {
            value.fold(self){ v => self.prefix(v) }
            } 


}

final class CommonPrefixOps(val self: CommonPrefix) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def prefixAsScala: Option[String] = Option(self.prefix) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCommonPrefixOps {

implicit def toCommonPrefixBuilderOps(v: CommonPrefix.Builder): CommonPrefixBuilderOps = new CommonPrefixBuilderOps(v)

implicit def toCommonPrefixOps(v: CommonPrefix): CommonPrefixOps = new CommonPrefixOps(v)

}

