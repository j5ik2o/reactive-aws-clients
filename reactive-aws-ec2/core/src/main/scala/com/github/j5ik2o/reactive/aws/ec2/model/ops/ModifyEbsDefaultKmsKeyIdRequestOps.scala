// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyEbsDefaultKmsKeyIdRequestBuilderOps(val self: ModifyEbsDefaultKmsKeyIdRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala(value: Option[String]): ModifyEbsDefaultKmsKeyIdRequest.Builder = {
            value.fold(self){ v => self.kmsKeyId(v) }
            } 


}

final class ModifyEbsDefaultKmsKeyIdRequestOps(val self: ModifyEbsDefaultKmsKeyIdRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyEbsDefaultKmsKeyIdRequestOps {

implicit def toModifyEbsDefaultKmsKeyIdRequestBuilderOps(v: ModifyEbsDefaultKmsKeyIdRequest.Builder): ModifyEbsDefaultKmsKeyIdRequestBuilderOps = new ModifyEbsDefaultKmsKeyIdRequestBuilderOps(v)

implicit def toModifyEbsDefaultKmsKeyIdRequestOps(v: ModifyEbsDefaultKmsKeyIdRequest): ModifyEbsDefaultKmsKeyIdRequestOps = new ModifyEbsDefaultKmsKeyIdRequestOps(v)

}

