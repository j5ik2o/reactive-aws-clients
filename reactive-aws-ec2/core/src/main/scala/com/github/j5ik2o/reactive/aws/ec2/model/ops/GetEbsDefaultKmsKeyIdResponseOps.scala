// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetEbsDefaultKmsKeyIdResponseBuilderOps(val self: GetEbsDefaultKmsKeyIdResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala(value: Option[String]): GetEbsDefaultKmsKeyIdResponse.Builder = {
            value.fold(self){ v => self.kmsKeyId(v) }
            } 


}

final class GetEbsDefaultKmsKeyIdResponseOps(val self: GetEbsDefaultKmsKeyIdResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetEbsDefaultKmsKeyIdResponseOps {

implicit def toGetEbsDefaultKmsKeyIdResponseBuilderOps(v: GetEbsDefaultKmsKeyIdResponse.Builder): GetEbsDefaultKmsKeyIdResponseBuilderOps = new GetEbsDefaultKmsKeyIdResponseBuilderOps(v)

implicit def toGetEbsDefaultKmsKeyIdResponseOps(v: GetEbsDefaultKmsKeyIdResponse): GetEbsDefaultKmsKeyIdResponseOps = new GetEbsDefaultKmsKeyIdResponseOps(v)

}

