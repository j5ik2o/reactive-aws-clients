// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFleetErrorBuilderOps(val self: CreateFleetError.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateAndOverridesAsScala(value: Option[LaunchTemplateAndOverridesResponse]): CreateFleetError.Builder = {
            value.fold(self){ v => self.launchTemplateAndOverrides(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lifecycleAsScala(value: Option[InstanceLifecycle]): CreateFleetError.Builder = {
            value.fold(self){ v => self.lifecycle(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorCodeAsScala(value: Option[String]): CreateFleetError.Builder = {
            value.fold(self){ v => self.errorCode(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorMessageAsScala(value: Option[String]): CreateFleetError.Builder = {
            value.fold(self){ v => self.errorMessage(v) }
            } 


}

final class CreateFleetErrorOps(val self: CreateFleetError) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateAndOverridesAsScala: Option[LaunchTemplateAndOverridesResponse] = Option(self.launchTemplateAndOverrides) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lifecycleAsScala: Option[InstanceLifecycle] = Option(self.lifecycle) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorCodeAsScala: Option[String] = Option(self.errorCode) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorMessageAsScala: Option[String] = Option(self.errorMessage) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFleetErrorOps {

implicit def toCreateFleetErrorBuilderOps(v: CreateFleetError.Builder): CreateFleetErrorBuilderOps = new CreateFleetErrorBuilderOps(v)

implicit def toCreateFleetErrorOps(v: CreateFleetError): CreateFleetErrorOps = new CreateFleetErrorOps(v)

}

