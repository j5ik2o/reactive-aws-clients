// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetOperationBuilderOps(val self: StackSetOperation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationIdAsScala(value: Option[String]): StackSetOperation.Builder = {
            value.fold(self){ v => self.operationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetIdAsScala(value: Option[String]): StackSetOperation.Builder = {
            value.fold(self){ v => self.stackSetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def actionAsScala(value: Option[StackSetOperationAction]): StackSetOperation.Builder = {
            value.fold(self){ v => self.action(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[StackSetOperationStatus]): StackSetOperation.Builder = {
            value.fold(self){ v => self.status(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationPreferencesAsScala(value: Option[StackSetOperationPreferences]): StackSetOperation.Builder = {
            value.fold(self){ v => self.operationPreferences(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def retainStacksAsScala(value: Option[Boolean]): StackSetOperation.Builder = {
            value.fold(self){ v => self.retainStacks(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def administrationRoleARNAsScala(value: Option[String]): StackSetOperation.Builder = {
            value.fold(self){ v => self.administrationRoleARN(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def executionRoleNameAsScala(value: Option[String]): StackSetOperation.Builder = {
            value.fold(self){ v => self.executionRoleName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimestampAsScala(value: Option[java.time.Instant]): StackSetOperation.Builder = {
            value.fold(self){ v => self.creationTimestamp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def endTimestampAsScala(value: Option[java.time.Instant]): StackSetOperation.Builder = {
            value.fold(self){ v => self.endTimestamp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deploymentTargetsAsScala(value: Option[DeploymentTargets]): StackSetOperation.Builder = {
            value.fold(self){ v => self.deploymentTargets(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetDriftDetectionDetailsAsScala(value: Option[StackSetDriftDetectionDetails]): StackSetOperation.Builder = {
            value.fold(self){ v => self.stackSetDriftDetectionDetails(v) }
            } 


}

final class StackSetOperationOps(val self: StackSetOperation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationIdAsScala: Option[String] = Option(self.operationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetIdAsScala: Option[String] = Option(self.stackSetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def actionAsScala: Option[StackSetOperationAction] = Option(self.action) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[StackSetOperationStatus] = Option(self.status) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationPreferencesAsScala: Option[StackSetOperationPreferences] = Option(self.operationPreferences) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def retainStacksAsScala: Option[Boolean] = Option(self.retainStacks) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def endTimestampAsScala: Option[java.time.Instant] = Option(self.endTimestamp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deploymentTargetsAsScala: Option[DeploymentTargets] = Option(self.deploymentTargets) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetDriftDetectionDetailsAsScala: Option[StackSetDriftDetectionDetails] = Option(self.stackSetDriftDetectionDetails) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOperationOps {

implicit def toStackSetOperationBuilderOps(v: StackSetOperation.Builder): StackSetOperationBuilderOps = new StackSetOperationBuilderOps(v)

implicit def toStackSetOperationOps(v: StackSetOperation): StackSetOperationOps = new StackSetOperationOps(v)

}

