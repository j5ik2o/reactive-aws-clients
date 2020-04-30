// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetPasswordDataResponseBuilderOps(val self: GetPasswordDataResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): GetPasswordDataResponse.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def passwordDataAsScala(value: Option[String]): GetPasswordDataResponse.Builder = {
            value.fold(self){ v => self.passwordData(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala(value: Option[java.time.Instant]): GetPasswordDataResponse.Builder = {
            value.fold(self){ v => self.timestamp(v) }
            } 


}

final class GetPasswordDataResponseOps(val self: GetPasswordDataResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def passwordDataAsScala: Option[String] = Option(self.passwordData) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPasswordDataResponseOps {

implicit def toGetPasswordDataResponseBuilderOps(v: GetPasswordDataResponse.Builder): GetPasswordDataResponseBuilderOps = new GetPasswordDataResponseBuilderOps(v)

implicit def toGetPasswordDataResponseOps(v: GetPasswordDataResponse): GetPasswordDataResponseOps = new GetPasswordDataResponseOps(v)

}

