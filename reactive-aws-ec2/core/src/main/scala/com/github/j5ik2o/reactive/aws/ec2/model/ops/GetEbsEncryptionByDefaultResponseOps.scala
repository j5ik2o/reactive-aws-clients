// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetEbsEncryptionByDefaultResponseBuilderOps(val self: GetEbsEncryptionByDefaultResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsEncryptionByDefaultAsScala(value: Option[Boolean]): GetEbsEncryptionByDefaultResponse.Builder = {
            value.fold(self){ v => self.ebsEncryptionByDefault(v) }
            } 


}

final class GetEbsEncryptionByDefaultResponseOps(val self: GetEbsEncryptionByDefaultResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsEncryptionByDefaultAsScala: Option[Boolean] = Option(self.ebsEncryptionByDefault) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetEbsEncryptionByDefaultResponseOps {

implicit def toGetEbsEncryptionByDefaultResponseBuilderOps(v: GetEbsEncryptionByDefaultResponse.Builder): GetEbsEncryptionByDefaultResponseBuilderOps = new GetEbsEncryptionByDefaultResponseBuilderOps(v)

implicit def toGetEbsEncryptionByDefaultResponseOps(v: GetEbsEncryptionByDefaultResponse): GetEbsEncryptionByDefaultResponseOps = new GetEbsEncryptionByDefaultResponseOps(v)

}

