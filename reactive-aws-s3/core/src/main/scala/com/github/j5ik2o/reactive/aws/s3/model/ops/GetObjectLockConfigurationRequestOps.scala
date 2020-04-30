// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectLockConfigurationRequestBuilderOps(val self: GetObjectLockConfigurationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala(value: Option[String]): GetObjectLockConfigurationRequest.Builder = {
            value.fold(self){ v => self.bucket(v) }
            } 


}

final class GetObjectLockConfigurationRequestOps(val self: GetObjectLockConfigurationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bucketAsScala: Option[String] = Option(self.bucket) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectLockConfigurationRequestOps {

implicit def toGetObjectLockConfigurationRequestBuilderOps(v: GetObjectLockConfigurationRequest.Builder): GetObjectLockConfigurationRequestBuilderOps = new GetObjectLockConfigurationRequestBuilderOps(v)

implicit def toGetObjectLockConfigurationRequestOps(v: GetObjectLockConfigurationRequest): GetObjectLockConfigurationRequestOps = new GetObjectLockConfigurationRequestOps(v)

}

