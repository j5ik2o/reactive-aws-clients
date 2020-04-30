// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DetectStackSetDriftRequestBuilderOps(val self: DetectStackSetDriftRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetNameAsScala(value: Option[String]): DetectStackSetDriftRequest.Builder = {
            value.fold(self){ v => self.stackSetName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationPreferencesAsScala(value: Option[StackSetOperationPreferences]): DetectStackSetDriftRequest.Builder = {
            value.fold(self){ v => self.operationPreferences(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationIdAsScala(value: Option[String]): DetectStackSetDriftRequest.Builder = {
            value.fold(self){ v => self.operationId(v) }
            } 


}

final class DetectStackSetDriftRequestOps(val self: DetectStackSetDriftRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationPreferencesAsScala: Option[StackSetOperationPreferences] = Option(self.operationPreferences) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationIdAsScala: Option[String] = Option(self.operationId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectStackSetDriftRequestOps {

implicit def toDetectStackSetDriftRequestBuilderOps(v: DetectStackSetDriftRequest.Builder): DetectStackSetDriftRequestBuilderOps = new DetectStackSetDriftRequestBuilderOps(v)

implicit def toDetectStackSetDriftRequestOps(v: DetectStackSetDriftRequest): DetectStackSetDriftRequestOps = new DetectStackSetDriftRequestOps(v)

}

